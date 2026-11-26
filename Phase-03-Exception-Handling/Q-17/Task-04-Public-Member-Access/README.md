# Task 4 – Accessing Public Members of a Package

## Aim
To write a Java program to access public data members and methods of a class from another package.

## Objectives
- To understand the concept of access modifiers in Java.
- To learn how public variables and methods can be accessed from another package.
- To understand the use of the `import` statement.
- To learn how to create and access objects of a class defined in another package.

## Theory

In Java, **access modifiers** define the accessibility or visibility of classes, variables, methods, and constructors.

Java provides four access levels:

| Access Modifier | Accessibility |
|---|---|
| `private` | Only within the same class |
| Default (no modifier) | Within the same package |
| `protected` | Within the same package and subclasses in other packages |
| `public` | Accessible from anywhere, subject to class and module accessibility |

In this practical, we use the `public` access modifier to access variables and methods of the `Student` class from another package.

The `import` statement is used to access the `Student` class from the `mypackage` package.

## Program Structure

```text
Task-04-Public-Member-Access/
│
├── README.md
│
└── src/
    ├── mypackage/
    │   └── Student.java
    │
    └── testpackage/
        └── Task4.java
```

## Source Code

### 1. Student.java

**Package:** `mypackage`

```java
package mypackage;

public class Student {
    public String name = "Abhishek Pandey";
    public int rollNo = 101;

    public void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollNo);
    }
}
```

### 2. Task4.java

**Package:** `testpackage`

```java
package testpackage;

import mypackage.Student;

public class Task4 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Accessing Public Variables:");
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);

        System.out.println("\nAccessing Public Method:");
        s.display();
    }
}
```

## Output

```text
Accessing Public Variables:
Name: Abhishek Pandey
Roll No: 101

Accessing Public Method:
Student Name : Abhishek Pandey
Roll Number : 101
```

## Explanation

1. The `Student` class is created inside the `mypackage` package.
2. The `name` and `rollNo` variables are declared using the `public` access modifier.
3. The `display()` method is also declared as `public`.
4. The `Task4` class belongs to a different package named `testpackage`.
5. The `import mypackage.Student;` statement imports the `Student` class.
6. An object of the `Student` class is created using `new Student()`.
7. The public variables are accessed directly using the object reference:
    - `s.name`
    - `s.rollNo`
8. The public method is called using `s.display()`.

This demonstrates that public members