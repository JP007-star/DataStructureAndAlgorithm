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

A **React form** is used to collect user input (like name, email, password, etc.) and manage it using React state.

---

## ✅ Simple React Form Example

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
