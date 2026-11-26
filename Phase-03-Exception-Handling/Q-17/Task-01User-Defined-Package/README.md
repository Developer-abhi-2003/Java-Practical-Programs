# Q17 – Package Creation in Java

## Task 1: Creating a User-Defined Package

### 1. Aim
To write a Java program to demonstrate the creation of a user-defined package and access its class using the `import` keyword.

### 2. Objective
- Understand the concept of packages in Java.
- Learn how to create a user-defined package.
- Understand the use of the `package` keyword.
- Learn how to import and access a class from another package.

### 3. Theory

A **package in Java** is a collection of related classes, interfaces, and sub-packages. It is used to organize Java programs and provide a structured way to manage classes.

**Types of Packages:**

1. Built-in Packages: Predefined packages provided by Java.
    - `java.lang`
    - `java.util`
    - `java.io`

2. User-Defined Packages: Packages created by programmers according to their requirements.

### 4. Program Structure

```text
Q17-Package-Creation/
│
├── src/
│   ├── mypackage/
│   │   └── Message.java
│   │
│   └── Task_1.java
│
└── README.md
```

### 5. Source Code

**File 1: Message.java**

Location: `src/mypackage/Message.java`

```java
package mypackage;

public class Message {

    public void display() {
        System.out.println("Hello! Welcome to mypackage");
    }
}
```

**File 2: Task_1.java**

Location: `src/Task_1.java`

```java
import mypackage.Message;

public class Task_1 {

    public static void main(String[] args) {

        Message msg = new Message();

        msg.display();
    }
}
```

### 6. Output

```text
Hello! Welcome to mypackage

Process finished with exit code 0
```

### 7. Explanation

1. The `package mypackage;` statement declares the package named `mypackage`.
2. The `Message` class is created inside the `mypackage` package.
3. The `import mypackage.Message;` statement imports the Message class into the main program.
4. An object of the Message class is created using `new Message()`.
5. The `display()` method is called using the object.

### 8. Important Keywords

| Keyword | Description |
|---|---|
| `package` | Declares a package. |
| `import` | Imports a class or package. |
| `public` | Makes a class or member accessible from other packages. |
| `new` | Creates an object. |

### 9. Conclusion

Thus, the Java program successfully demonstrates the creation of a user-defined package and accessing its class from another class using the `import` keyword.