# Practical 14 – Access Specifiers in Java

## Objective

To write a Java program to demonstrate the concept of access specifiers and understand how they control the visibility and accessibility of class members.

## Introduction

Access specifiers in Java are keywords that define the accessibility of classes, variables, methods, and constructors.

They determine where a particular member of a class can be accessed.

Java provides four access levels:

1. **Private**
2. **Default (Package-Private)**
3. **Protected**
4. **Public**

## 1. Types of Access Specifiers

| Access Specifier | Accessibility |
|---|---|
| `private` | Accessible only within the declaring class |
| Default | Accessible within the same package |
| `protected` | Accessible within the same package and in subclasses in different packages, subject to inheritance rules |
| `public` | Accessible wherever the declaring class is accessible |

### Accessibility Comparison Table

| Access Level | Same Class | Same Package | Different Package (Subclass) | Different Package (Non-Subclass) |
|---|:---:|:---:|:---:|:---:|
| Private | Yes | No | No | No |
| Default | Yes | Yes | No | No |
| Protected | Yes | Yes | Yes* | No |
| Public | Yes | Yes | Yes | Yes |

*Protected members in another package are accessible through inheritance, subject to Java's protected-access restrictions.*

---

## 2. Approach 1 – Access Specifiers Within the Same Class

### Description

In this approach, all four access specifiers are declared and accessed within the same class named `Student`.

### Variables Used

| Variable | Access Specifier | Value |
|---|---|---|
| `rollNo` | Private | 1629 |
| `marks` | Default | 88 |
| `name` | Protected | Abhishek Pandey |
| `clg` | Public | SCN CLG |

### Explanation

- Private members can be accessed directly within their declaring class.
- Default members can be accessed within the same package.
- Protected members can be accessed within the same package.
- Public members can be accessed wherever the declaring class is accessible.

The program demonstrates that all four access levels are accessible from methods belonging to the same class.

---

## 3. Approach 2 – Access Through a Static Nested Class

### Description

In this approach, a static nested class named `Numbers` is declared inside `AccessSpecifier_Approach2`.

Four variables are declared using different access specifiers.

### Variables Used

| Variable | Access Specifier | Value |
|---|---|---|
| `a` | Private | 100 |
| `b` | Default | 200 |
| `c` | Public | 300 |
| `d` | Protected | 400 |

### Explanation

- The `Numbers` class contains all four variables.
- Its `show()` method accesses all four variables directly.
- The enclosing class can also access the private members of its nested class.
- The `main()` method creates an object of `Numbers` and accesses all four variables.

This approach demonstrates private access between an enclosing class and its nested class.

---

## 4. Approach 3 – Access Through Another Nested Class

### Description

In this approach, two static nested classes named `Numbers` and `Test` are declared inside `AccessSpecifier_Approach3`.

The `Test` class attempts to access the members of the `Numbers` class.

### Explanation

- Both nested classes belong to the same enclosing class.
- Both classes are in the same package.
- Default, protected, and public members can be accessed from `Test`.
- The private member cannot be accessed directly from `Test`.

This demonstrates that private access is restricted to the declaring class and its permitted enclosing/nested-class access relationship.

---

## 5. Approach 4 – Access Specifiers Across Different Packages

### Description

This approach demonstrates how access specifiers behave when classes belong to different packages.

Two packages are created:

- `package1`
- `package2`

### Package Structure

```text
AccessSpecifier/
│
├── package1/
│   └── Parent.java
│
└── package2/
    ├── Child.java
    └── Main.java
```

### Parent Class

The `Parent` class is declared inside `package1`.

It contains four variables:

| Variable | Access Specifier | Value |
|---|---|---|
| `a` | Private | 10 |
| `b` | Default | 20 |
| `c` | Protected | 30 |
| `d` | Public | 40 |

### Child Class

The `Child` class is declared inside `package2` and inherits the `Parent` class using the `extends` keyword.

### Explanation

- Private member `a` cannot be accessed directly in the child class.
- Default member `b` cannot be accessed because the child class belongs to a different package.
- Protected member `c` can be accessed through inheritance.
- Public member `d` can be accessed from another package.

### Main Class

The `main()` method creates two objects:

1. An object of `Child`.
2. An object of `Parent`.

The Parent object can directly access the public member `d`.

The Child object can access the inherited protected member `c` through its `display()` method.

**Important observation:**

A protected member inherited from another package cannot be accessed through an arbitrary `Parent` object in the `Child` class. It must be accessed through the subclass inheritance context.

---

## 6. Important Java Keywords and Concepts

| Keyword / Concept | Description |
|---|---|
| `private` | Restricts access to the declaring class |
| `protected` | Allows same-package access and qualifying subclass access |
| `public` | Provides the widest accessibility |
| Default | Provides package-level accessibility without using a keyword |
| `static` | Makes a member belong to the class rather than an instance |
| `class` | Declares a class |
| `extends` | Establishes inheritance |
| `package` | Declares the package to which a class belongs |
| `import` | Imports a class from another package |
| Nested Class | A class declared inside another class |

## 7. Important Observations

1. Private members cannot be accessed directly from unrelated classes.
2. Default access is limited to the same package.
3. Protected access allows subclasses in different packages to access inherited members under specific rules.
4. Public members provide the widest accessibility.
5. An enclosing class can access private members of its nested classes.
6. Access specifiers help implement encapsulation and control access to data.

## 8. Conclusion

Through this practical, we studied the four access levels in Java: private, default, protected, and public.

We demonstrated their behaviour within the same class, between nested classes, between separate classes in the same package, and across different packages using inheritance.

Thus, access specifiers help control the visibility of class members and support data protection and encapsulation in Java.