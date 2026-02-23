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

---

