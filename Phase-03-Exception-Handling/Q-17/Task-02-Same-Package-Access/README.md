# Q17 – Package Creation in Java

## Task 2: Accessing a Class Within the Same Package

### 1. Aim
To write a Java program to demonstrate how one class can access another class belonging to the same user-defined package.

### 2. Objective
- Understand how multiple classes can exist within the same package.
- Learn how to access one class from another class.
- Understand object creation and method invocation.
- Learn why an import statement is not required for accessing classes within the same package.

### 3. Theory

In Java, multiple classes can be grouped within a single package. Classes belonging to the same package can directly access one another without requiring an explicit `import` statement.

In this program, two classes, `Calculator` and `Task2`, are created inside the `mypackage` package.

The `Task2` class creates an object of the `Calculator` class and calls its methods to perform addition and subtraction.

### 4. Program Structure

```text
Task-02-Same-Package-Access/
│
├── README.md
│
└── src/
    └── mypackage/
        ├── Calculator.java
        └── Task2.java
```

### 5. Source Code

**File 1: Calculator.java**

```java
package mypackage;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

**File 2: Task2.java**

```java
package mypackage;

public class Task2 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum = calc.add(20, 10);
        int difference = calc.subtract(20, 10);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}
```

### 6. Output

```text
Addition: 30
Subtraction: 10
```

### 7. Explanation

1. The `package mypackage;` statement declares that both classes belong to the same package.
2. The `Calculator` class defines two methods: `add()` and `subtract()`.
3. The `Task2` class creates an object of the `Calculator` class.
4. The `add()` method performs addition of two numbers.
5. The `subtract()` method performs subtraction of two numbers.
6. The results are displayed using `System.out.println()`.

### 8. Important Concepts

| Concept | Description |
|---|---|
| Same Package | Classes grouped under the same package declaration. |
| `package` | Declares the package of a class. |
| Object Creation | Creates an instance of a class using `new`. |
| Method Invocation | Calls a method using an object. |
| `import` | Not required for referring to classes in the same package. |

### 9. Conclusion

Thus, the Java program successfully demonstrates how one class can access another class belonging to the same user-defined package without using an explicit `import` statement.