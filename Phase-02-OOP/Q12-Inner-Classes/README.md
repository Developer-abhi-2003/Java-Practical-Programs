# Practical 12: Nested Classes in Java

## Objective

To write Java programs demonstrating the four types of nested classes in Java:

1. Member Inner Class
2. Static Nested Class
3. Local Inner Class
4. Anonymous Inner Class

---

## 1. Introduction

A nested class is a class declared inside another class. Nested classes help logically group related classes and improve code organization.

Java supports two main categories:

- **Static Nested Class:** A static class declared inside another class.
- **Inner Classes:** Non-static nested classes, including Member Inner Classes, Local Inner Classes, and Anonymous Inner Classes.

---

## 2. Types of Nested Classes

### 2.1 Member Inner Class

A non-static class declared inside another class is called a Member Inner Class.

**Characteristics:**

- It is declared inside another class without using the `static` keyword.
- It can access all members of its enclosing class, including private members.
- Its object is associated with an instance of the outer class.
- It can directly access both static and non-static members of the outer class.

**Object Creation:**

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
```

### 2.2 Static Nested Class

A static class declared inside another class is called a Static Nested Class.

**Characteristics:**

- It is declared using the `static` keyword.
- It does not require an object of the outer class for its creation.
- It can directly access static members of the outer class.
- It cannot directly