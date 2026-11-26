# Q17 – Package Creation in Java

## Task 3: Accessing a Class from Another Package

### 1. Aim

To write a Java program to demonstrate how a class belonging to one user-defined package can be accessed from another package using the `import` keyword.

### 2. Objective

- Understand how to create multiple user-defined packages.
- Learn how to access a class from another package.
- Understand the use of the `import` keyword.
- Learn about fully qualified class names.
- Understand public class accessibility across packages.

### 3. Theory

In Java, a class belonging to one package can be accessed from another package if it has the appropriate access permissions.

The `import` keyword allows a programmer to use a class from another package without writing its fully qualified name every time.

In this experiment, two packages are created:

1. `mypackage` – Contains the `Calculator` class.
2. `testpackage` – Contains the `Task3` class.

The `Task3` class imports the `Calculator` class and accesses its methods to perform multiplication and division.

### 4. Program Structure

```text
Task-03-Access-Another-Package/
│
├── README.md
│
└── src/
    ├── mypackage/
    │   └── Calculator.java
    │
    └── testpackage/
        └── Task3.java
```

### 5. Source Code

**File 1: Calculator.java**

Location: `src/mypackage/Calculator.java`

```java
package mypackage;

public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
```

**File 2: Task3.java**

Location: `src/testpackage/Task3.java`

```java
package testpackage;

import mypackage.Calculator;

public class Task3 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int product = calc.multiply(20, 10);
        int quotient = calc.divide(20, 10);

        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}
```

### 6. Output

```text
Multiplication: 200
Division: 2
```

### 7. Explanation

1. The `package mypackage;` statement declares the Calculator class inside the `mypackage` package.
2. The `package testpackage;` statement declares the Task3 class inside the `testpackage` package.
3. The `import mypackage.Calculator;` statement imports the Calculator class into Task3.
4. An object of the Calculator class is created.
5. The `multiply()` method performs multiplication of two numbers.
6. The `divide()` method performs division of two numbers.
7. The results are displayed using `System.out.println()`.

### 8. Important Concepts

| Concept | Description |
|---|---|
| `package` | Declares a package. |
| `import` | Allows a class to be referred to by its simple name. |
| `public` | Makes a class accessible from other packages. |
| Fully Qualified Class Name | Package name followed by the class name, e.g. `mypackage.Calculator`. |
| `main()` | Entry point of the Java application. |

**Note:** An import statement is not compulsory. A public class from another package can also be accessed using its fully qualified class name.

### 9. Conclusion

Thus, the Java program successfully demonstrates accessing a class from another user-defined package using the `import` keyword and calling its public methods.