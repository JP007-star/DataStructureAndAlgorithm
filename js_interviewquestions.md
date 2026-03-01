## ✅ JavaScript Concepts

### ✔ What is Hoisting?

JavaScript moves declarations to the top of their scope during compilation.

* `var` → hoisted and initialized with `undefined`
* `let` & `const` → hoisted but in **Temporal Dead Zone**
* functions → fully hoisted

```js
console.log(x); // undefined
var x = 10;
```

---

### ✔ What are Closures?

A closure is when a function remembers variables from its outer scope even after that scope has finished executing.

```js
function outer() {
  let count = 0;
  return function inner() {
    count++;
    return count;
  }
}

const counter = outer();
counter(); // 1
counter(); // 2
```

Used in:

* data privacy
* callbacks
* memoization

---

### ✔ What are Microtasks?

High-priority tasks executed **after current synchronous code** but **before macrotasks**.

Examples:

* Promise `.then()`
* `queueMicrotask()`
* `MutationObserver`

Execution priority:

```
Call stack → Microtask queue → Macrotask queue
```

---

### ✔ Event Loop in JavaScript

The Event Loop manages asynchronous execution.

Steps:

1. Execute call stack
2. If empty → run microtasks
3. Then run macrotasks (setTimeout, I/O etc.)
4. Repeat

It enables **non-blocking single-threaded execution**.

---

### ✔ What is Debouncing?

Technique to limit function calls by delaying execution until user stops triggering event.

Used for:

* search input
* resize events
* API calls

```js
function debounce(fn, delay) {
  let timer;
  return function() {
    clearTimeout(timer);
    timer = setTimeout(() => fn.apply(this, arguments), delay);
  };
}
```

---



✅ Simple React Form Example

```jsx
import React, { useState } from "react";

function MyForm() {
  const [formData, setFormData] = useState({
    name: "",
    email: ""
  });

  // handle input change
  const handleChange = (e) => {
    const { name, value } = e.target;

    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  };

  // handle form submit
  const handleSubmit = (e) => {
    e.preventDefault(); // prevent page reload
    console.log("Form submitted:", formData);
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Name:</label>
        <input
          type="text"
          name="name"
          value={formData.name}
          onChange={handleChange}
        />
      </div>

      <div>
        <label>Email:</label>
        <input
          type="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
        />
      </div>

      <button type="submit">Submit</button>
    </form>
  );
}

export default MyForm;
```

---

## ✅ How it works

1. `useState()` stores form values
2. `onChange` updates state when user types
3. `onSubmit` handles form submission
4. `e.preventDefault()` stops page refresh

This is called a **controlled form**.

---

## ✅ Multiple Inputs (dynamic handling)

Using `name` attribute lets one function handle all inputs (clean code 👍).

---

## ✅ Checkbox Example

```jsx
const [agree, setAgree] = useState(false);

<input
  type="checkbox"
  checked={agree}
  onChange={(e) => setAgree(e.target.checked)}
/>
```

---

## ✅ Best React Form Libraries (used in real projects)

* React Hook Form ⭐ (most popular)
* Formik
* Yup (validation)

---

## Example using React Hook Form (short)

```jsx
import { useForm } from "react-hook-form";

function MyForm() {
  const { register, handleSubmit } = useForm();

  const onSubmit = data => console.log(data);

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register("name")} />
      <input {...register("email")} />
      <button type="submit">Submit</button>
    </form>
  );
}
```

## 

### ✔ Example API calls

```
GET /api/vehicles
GET /api/vehicles?fleetId=10
GET /api/vehicles?availabilityStatus=true
GET /api/vehicles?fleetId=10&availabilityStatus=true
```

---

### ✔ How will vehicle details be displayed in the UI?

Typical flow:

1. Frontend calls REST API
2. Backend returns JSON list of vehicles
3. UI renders table / cards

Example using **React**

```javascript
import { useEffect, useState } from "react";

function VehicleList() {
  const [vehicles, setVehicles] = useState([]);

  useEffect(() => {
    fetch("/api/vehicles")
      .then(res => res.json())
      .then(data => setVehicles(data));
  }, []);

  return (
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Status</th>
          <th>Fleet</th>
        </tr>
      </thead>
      <tbody>
        {vehicles.map(v => (
          <tr key={v.id}>
            <td>{v.id}</td>
            <td>{v.name}</td>
            <td>{v.availabilityStatus ? "Available" : "Unavailable"}</td>
            <td>{v.fleetId}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
```

So UI rendering = **fetch → store in state → map → display**.

---

## ✅ React Concepts

### ✔ How does useMemo() work?

Memoizes computed value to avoid expensive recalculations.

Runs only when dependencies change.

```js
const total = useMemo(() => calculateTotal(items), [items]);
```

Use when:

* heavy computations
* preventing unnecessary re-renders

---

### ✔ What is useContext()?

Hook to access global data without prop drilling.

Steps:

1. Create context
2. Provide value
3. Consume anywhere

```js
const ThemeContext = createContext();

const theme = useContext(ThemeContext);
```

Used for:

* auth
* theme
* language
* global config

---

### ✔ Class vs Functional Components


| Feature      | Class Components  | Functional Components |
| ------------ | ----------------- | --------------------- |
| Syntax       | ES6 class         | Simple function       |
| State        | this.state        | useState              |
| Lifecycle    | lifecycle methods | useEffect             |
| Hooks        | ❌ Not supported  | ✅ Supported          |
| Performance  | More boilerplate  | Lightweight           |
| Readability  | Verbose           | Cleaner               |
| Modern React | Legacy            | Recommended           |

Got it — you want to understand **closures in JavaScript**.
Let’s break it down clearly and practically.

---

## ✅ What is a Closure in JavaScript?

A **closure** is when a function **remembers and can access variables from its outer (parent) scope**, even after the outer function has finished executing.

👉 In simple words:
**Function + its surrounding variables = Closure**

JavaScript functions “carry” their environment with them.

---

## ✅ Basic Example

```javascript
function outer() {
    let message = "Hello JP";

    function inner() {
        console.log(message);
    }

    return inner;
}

const fn = outer();
fn();
```

### What happens here?

1. `outer()` runs → creates `message`
2. `outer()` returns `inner`
3. Normally `message` should disappear… ❌
4. But `inner()` still remembers it ✅

Output:

```
Hello JP
```

👉 `inner()` forms a **closure** over `message`.

---

## ✅ Why Closures Work (Core Concept)

JavaScript uses **lexical scoping**.

That means:

> A function can access variables defined where it was created, not where it is called.

Even if the parent function is gone, the variables stay in memory because the child function still uses them.

---

## ✅ Real-World Use Case 1 — Data Privacy (Very Important)

Closures help create **private variables**.

```javascript
function counter() {
    let count = 0;

    return function () {
        count++;
        console.log(count);
    };
}

const increment = counter();

increment(); // 1
increment(); // 2
increment(); // 3
```

Here:

* `count` is private
* Cannot access directly
* Only modified through closure

This is how **encapsulation** is done in JS without classes.

---

## ✅ Real-World Use Case 2 — Function Factory

Create functions dynamically.

```javascript
function multiplyBy(x) {
    return function (y) {
        return x * y;
    };
}

const double = multiplyBy(2);
const triple = multiplyBy(3);

console.log(double(5)); // 10
console.log(triple(5)); // 15
```

Each function remembers its own `x`.

---

## ✅ Real-World Use Case 3 — setTimeout Problem (Classic Interview Question)

❌ Without closure (using var)

```javascript
for (var i = 1; i <= 3; i++) {
    setTimeout(() => console.log(i), 1000);
}
```

Output:

```
4
4
4
```

Why? Because all callbacks share same `i`.

---

✅ Fix using closure

```javascript
for (var i = 1; i <= 3; i++) {
    (function(x) {
        setTimeout(() => console.log(x), 1000);
    })(i);
}
```

Output:

```
1
2
3
```

Each iteration gets its own copy of `x`.

---

## ✅ Closures and Memory

Closures keep variables alive in memory.

Good 👍

* state management
* caching
* encapsulation

Be careful ⚠️

* can cause memory leaks if holding large objects unnecessarily

---

## ✅ Closure Interview Definition (Perfect Answer)

> A closure is a function that has access to variables from its lexical scope even after the outer function has finished execution.

---

## ✅ Visual Mental Model

```
outer()
   message = "Hello"

   inner() → remembers message

return inner

later → inner() still sees message
```

---


## ✅ What is a Closure in JavaScript?

A **closure** is when a function **remembers and can access variables from its outer (parent) scope**, even after the outer function has finished executing.

👉 In simple words:
**Function + its surrounding variables = Closure**

JavaScript functions “carry” their environment with them.

---

## ✅ Basic Example

```javascript
function outer() {
    let message = "Hello JP";

    function inner() {
        console.log(message);
    }

    return inner;
}

const fn = outer();
fn();
```

### What happens here?

1. `outer()` runs → creates `message`
2. `outer()` returns `inner`
3. Normally `message` should disappear… ❌
4. But `inner()` still remembers it ✅

Output:

```
Hello JP
```

👉 `inner()` forms a **closure** over `message`.

---

## ✅ Why Closures Work (Core Concept)

JavaScript uses **lexical scoping**.

That means:

> A function can access variables defined where it was created, not where it is called.

Even if the parent function is gone, the variables stay in memory because the child function still uses them.

---

## ✅ Real-World Use Case 1 — Data Privacy (Very Important)

Closures help create **private variables**.

```javascript
function counter() {
    let count = 0;

    return function () {
        count++;
        console.log(count);
    };
}

const increment = counter();

increment(); // 1
increment(); // 2
increment(); // 3
```

Here:

* `count` is private
* Cannot access directly
* Only modified through closure

This is how **encapsulation** is done in JS without classes.

---

## ✅ Real-World Use Case 2 — Function Factory

Create functions dynamically.

```javascript
function multiplyBy(x) {
    return function (y) {
        return x * y;
    };
}

const double = multiplyBy(2);
const triple = multiplyBy(3);

console.log(double(5)); // 10
console.log(triple(5)); // 15
```

Each function remembers its own `x`.

---

## ✅ Real-World Use Case 3 — setTimeout Problem (Classic Interview Question)

❌ Without closure (using var)

```javascript
for (var i = 1; i <= 3; i++) {
    setTimeout(() => console.log(i), 1000);
}
```

Output:

```
4
4
4
```

Why? Because all callbacks share same `i`.

---

✅ Fix using closure

```javascript
for (var i = 1; i <= 3; i++) {
    (function(x) {
        setTimeout(() => console.log(x), 1000);
    })(i);
}
```

Output:

```
1
2
3
```

Each iteration gets its own copy of `x`.

---

## ✅ Closures and Memory

Closures keep variables alive in memory.

Good 👍

* state management
* caching
* encapsulation

Be careful ⚠️

* can cause memory leaks if holding large objects unnecessarily

---

## ✅ Closure Interview Definition (Perfect Answer)

> A closure is a function that has access to variables from its lexical scope even after the outer function has finished execution.

---

## ✅ Visual Mental Model

```
outer()
   message = "Hello"

   inner() → remembers message

return inner

later → inner() still sees message
```



In the browser, every DOM event travels through **3 phases**:

```
1️⃣ Capturing phase   (top → down)
2️⃣ Target phase      (actual element)
3️⃣ Bubbling phase    (bottom → up)
```

Let’s understand clearly with **code + execution order**.

---

## 🎯 HTML Structure

```html
<div id="grandparent">
  Grandparent
  <div id="parent">
    Parent
    <button id="child">Click me</button>
  </div>
</div>
```

DOM tree:

```
document
  └─ grandparent
       └─ parent
            └─ child (button)
```

---

## ✅ JavaScript — Listen in ALL 3 PHASES

```javascript
const grandparent = document.getElementById("grandparent");
const parent = document.getElementById("parent");
const child = document.getElementById("child");

// CAPTURING PHASE (true)
grandparent.addEventListener("click", () => {
    console.log("Grandparent CAPTURE");
}, true);

parent.addEventListener("click", () => {
    console.log("Parent CAPTURE");
}, true);

child.addEventListener("click", () => {
    console.log("Child CAPTURE");
}, true);

// BUBBLING PHASE (default false)
grandparent.addEventListener("click", () => {
    console.log("Grandparent BUBBLE");
});

parent.addEventListener("click", () => {
    console.log("Parent BUBBLE");
});

child.addEventListener("click", () => {
    console.log("Child BUBBLE");
});
```

---

## 🧪 Click the button → Output order

```
Grandparent CAPTURE
Parent CAPTURE
Child CAPTURE

Child BUBBLE
Parent BUBBLE
Grandparent BUBBLE
```

This shows the full event journey.

---

# 🧠 Phase 1 — Capturing Phase (Trickling)

Event travels from **top of DOM → down to target**.

```
document → grandparent → parent → child
```

Only handlers registered with:

```javascript
addEventListener(type, handler, true)
```

run during this phase.

👉 Rarely used, but helpful for intercepting events early.

---

# 🧠 Phase 2 — Target Phase

Event reaches the **actual clicked element**.

In our case:

```
child button
```

Both capturing and bubbling handlers on target can run.

So if target has both:

```javascript
child.addEventListener("click", handler, true);  // capture
child.addEventListener("click", handler);        // bubble
```

Both execute here (capture first, then bubble).

---

# 🧠 Phase 3 — Bubbling Phase (Default)

Event moves **back upward**.

```
child → parent → grandparent → document
```

All normal event listeners run here.

```javascript
addEventListener(type, handler)
```

This is what developers use most.

---

## 🔥 Visual Flow (Full Journey)

```
CAPTURING ↓
document
grandparent
parent
child (target)

TARGET 🎯

BUBBLING ↑
child
parent
grandparent
document
```

---

## ✅ Stop Event in Any Phase

### Stop further propagation

```javascript
child.addEventListener("click", (e) => {
    e.stopPropagation();
});
```

Event stops immediately — no more phases.

---

### Stop other handlers on same element too

```javascript
e.stopImmediatePropagation();
```

Stronger version.

---

## 🎯 Interview Perfect Answer

> When an event occurs in the DOM, it propagates in three phases: capturing (top-down traversal to the target), target phase (event reaches the actual element), and bubbling (event propagates back up through ancestors). By default, event listeners run in the bubbling phase, but they can be configured to run during capturing.

---


