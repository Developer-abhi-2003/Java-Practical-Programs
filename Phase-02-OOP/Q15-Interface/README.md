# Practical 15: Interface in Java

## Objective

To understand and implement the concept of **interfaces in Java** and explore their features, rules, and practical applications through different programs.

## Concepts Covered

1. Basic interface implementation
2. Implementing multiple interfaces in one class
3. Interface inheritance
4. Multiple inheritance through interfaces
5. Default methods in interfaces
6. Static methods in interfaces
7. Private methods in interfaces
8. Functional interfaces and lambda expressions
9. Predefined functional interfaces
10. Method references
11. Interface polymorphism
12. Interface constants
13. Real-world implementation of multiple interfaces

---

## Experiment 1: Basic Interface Implementation

**Objective:** To create an interface and implement it in a class.

**Concepts:**
- An interface is a reference type in Java.
- It defines a contract that implementing classes must follow.
- A class uses the `implements` keyword to implement an interface.
- The implementing class must provide implementations for the interface's abstract methods.

**Program Description:**

Create a `Shape` interface containing the `calculateArea()` method. Implement this interface in a `Rectangle` class and calculate the area of a rectangle.

**Expected Output:**
```text
Area of Rectangle = 50
```

## Experiment 2: Implementing Multiple Interfaces

**Objective:** To implement more than one interface in a single class.

**Concepts:**
- A Java class can implement multiple interfaces.
- Multiple interface names are separated by commas.
- The class must implement all inherited abstract methods.

**Program Description:**

Create two interfaces, `Printable` and `Showable`, containing the `print()` and `show()` methods. Implement both interfaces in a `Document` class.

**Key Syntax:**
```java
class Document implements Printable, Showable {
    // Implement both methods
}
```

## Experiment 3: Interface Inheritance

**Objective:** To demonstrate how one interface can inherit another interface.

**Concepts:**
- An interface can extend another interface using the `extends` keyword.
- The child interface inherits the abstract methods of its parent interface.
- A class implementing the child interface must implement all inherited abstract methods.

**Program Description:**

Create a `Vehicle` interface containing `start()`. Create a `Car` interface that extends `Vehicle` and declares `drive()`. Implement the `Car` interface in a `BMW` class.

**Key Syntax:**
```java
interface Car extends Vehicle {
    void drive();
}
```

## Experiment 4: Multiple Interface Inheritance

**Objective:** To demonstrate multiple inheritance using interfaces.

**Concepts:**
- Java does not support multiple inheritance through classes.
- An interface can extend multiple interfaces.
- This allows an interface to inherit method declarations from multiple parent interfaces.

**Program Description:**

Create `Camera` and `MusicPlayer` interfaces. Create a `Smartphone` interface that extends both. Implement `Smartphone` in an `AndroidPhone` class.

**Key Syntax:**
```java
interface Smartphone extends Camera, MusicPlayer {
    void makeCall();
}
```

## Experiment 5: Default Methods in Interfaces

**Objective:** To demonstrate default methods in an interface.

**Concepts:**
- Default methods were introduced in Java 8.
- A default method has a method body inside an interface.
- It is declared using the `default` keyword.
- Implementing classes inherit the default method and may override it.

**Program Description:**

Create a `Bank` interface with an abstract method `getRateOfInterest()` and a default method `displayBankName()`. Implement the interface in an `SBI` class.

**Key Syntax:**
```java
interface Bank {
    default void displayBankName() {
        System.out.println("Bank Name");
    }
}
```

## Experiment 6: Static Methods in Interfaces

**Objective:** To demonstrate static methods inside an interface.

**Concepts:**
- Static methods in interfaces were introduced in Java 8.
- They are declared using the `static` keyword.
- They are called using the interface name.
- They are not inherited as instance methods by implementing classes.

**Program Description:**

Create a `MathOperations` interface with static methods `square()` and `cube()`. Call these methods directly using the interface name.

**Key Syntax:**
```java
MathOperations.square(5);
MathOperations.cube(5);
```

**Expected Output:**
```text
Square = 25
Cube = 125
```

## Experiment 7: Private Methods in Interfaces

**Objective:** To demonstrate private methods inside an interface.

**Concepts:**
- Private methods in interfaces were introduced in Java 9.
- They contain a method body.
- They help avoid duplicate code inside an interface.
- They can be called by other methods within the same interface.
- They cannot be accessed directly by implementing classes.

**Program Description:**

Create a `Calculator` interface with a private method `displayMessage()`. Call this private method from default methods such as `addition()` and `subtraction()`.

**Important:** A private interface method is used internally by the interface; it is not directly available to the implementing class.

## Experiment 8: Functional Interface and Lambda Expressions

**Objective:** To demonstrate functional interfaces and lambda expressions.

**Concepts:**
- A functional interface contains exactly one abstract method.
- It can contain default, static, and private methods as well.
- The `@FunctionalInterface` annotation helps ensure that the interface follows the functional-interface rule.
- Lambda expressions provide a concise way to implement the functional interface's abstract method.
- The lambda operator is `->`.

**Program Description:**

Create a functional interface named `Calculator` with a method `calculate(int a, int b)`. Use lambda expressions to perform addition and subtraction.

**Key Syntax:**
```java
Calculator c = (a, b) -> a + b;
Calculator d = (a, b) -> a - b;
```

**Expected Output:**
```text
Addition = 30
Subtraction = -10
```

## Experiment 9: Predefined Functional Interfaces

**Objective:** To demonstrate predefined functional interfaces available in Java.

**Concepts:**

Java provides predefined functional interfaces in the `java.util.function` package.

| Interface | Purpose | Main Method |
|---|---|---|
| `Predicate<T>` | Takes an input and returns a boolean | `test()` |
| `Function<T,R>` | Takes an input and returns a result | `apply()` |
| `Consumer<T>` | Takes an input and returns nothing | `accept()` |
| `Supplier<T>` | Takes no input and supplies a result | `get()` |

**Program Description:**

Use the four predefined functional interfaces to:
1. Check whether a number is even using `Predicate`.
2. Calculate the square of a number using `Function`.
3. Display a welcome message using `Consumer`.
4. Supply an integer value using `Supplier`.

**Expected Output:**
```text
Is 5 even ? false
Is 8 even ? true
Square of 5 = 25
Welcome to Java, Abhishek!
Supplied Value = 100
```

## Experiment 10: Method References

**Objective:** To demonstrate method references in Java.

**Concepts:**
- Method references provide a shorter way to refer to an existing method.
- They use the `::` operator.
- They are commonly used with functional interfaces and lambda expressions.

**Types of Method References:**

1. **Static Method Reference**
    - Syntax: `ClassName::methodName`
    - Refers to a static method of a class.

2. **Instance Method Reference**
    - Syntax: `objectName::methodName`
    - Refers to an instance method of an existing object.

3. **Constructor Reference**
    - Syntax: `ClassName::new`
    - Refers to a constructor of a class.

**Program Description:**

Demonstrate all three types:
- Use a static `cube()` method to calculate a number's cube.
- Use an instance `printMessage()` method to display a message.
- Use a constructor reference to create an `Employee` object.

**Expected Output:**
```text
Cube of 4 = 64
Hii Abhishek, let's start Learning of Java Method Reference
Employee Name = Abhishek
```

## Experiment 11: Interface Polymorphism

**Objective:** To demonstrate runtime polymorphism using an interface reference.

**Concepts:**
- An interface reference can refer to an object of any class that implements that interface.
- The same interface reference can point to different implementing objects.
- The overridden method is selected at runtime according to the actual object.
- This demonstrates runtime polymorphism and dynamic method dispatch.

**Program Description:**

Create a `Payment` interface with a `pay()` method. Implement it in two classes, `UPI` and `CreditCard`. Use a single `Payment` reference to call the methods of both objects.

**Key Syntax:**
```java
Payment p;

p = new UPI();
p.pay(500);

p = new CreditCard();
p.pay(50000);
```

**Expected Output:**
```text
Payment through UPI = 500
Payment through Credit Card = 50000
```

## Experiment 12: Interface Constants

**Objective:** To demonstrate constants declared inside an interface.

**Concepts:**
- Every variable declared inside an interface is implicitly `public`, `static`, and `final`.
- Interface variables must be initialized when declared.
- They can be accessed using the interface name.
- Their values cannot be reassigned.

**Program Description:**

Create a `Company` interface containing constants such as `COMPANY_NAME`, `EMP_COUNT`, and `COUNTRY`. Access these constants directly using the interface name.

**Key Syntax:**
```java
Company.COMPANY_NAME;
Company.EMP_COUNT;
Company.COUNTRY;
```

**Expected Output:**
```text
Company Name = DRDO
Employee Count = 1000
Country = India
```

## Experiment 13: Real-World Application of Multiple Interfaces

**Objective:** To demonstrate multiple interface implementation through a banking system.

**Concepts:**
- A class can implement multiple interfaces.
- Each interface can represent a separate responsibility.
- The implementing class must provide the implementation of all abstract methods.
- Conditional statements can be used to validate transactions.

**Program Description:**

Create three interfaces:
- `Deposit` – declares a method to deposit money.
- `Withdraw` – declares a method to withdraw money.
- `Balance` – declares a method to check the current balance.

Create a `BankAccount` class that implements all three interfaces.

The program should:
1. Initialize an account with a balance of ₹10,000.
2. Validate deposit amounts.
3. Validate withdrawal amounts.
4. Prevent withdrawals when the balance is insufficient.
5. Display the current balance.

**Expected Output for the demonstrated test case:**
```text
Current Balance = 10000.0
Invalid Deposit Amount!
Insufficient Balance!
Current Balance = 10000.0
```

---

## Important Java Keywords and Operators

| Keyword / Operator | Purpose |
|---|---|
| `interface` | Declares an interface |
| `implements` | Implements an interface in a class |
| `extends` | Inherits an interface |
| `default` | Declares a default method |
| `static` | Declares a static method or field |
| `private` | Restricts access to the declaring interface/class |
| `@Override` | Indicates that a method overrides or implements another method |
| `@FunctionalInterface` | Marks an interface intended to have one abstract method |
| `->` | Lambda expression operator |
| `::` | Method reference operator |
| `new` | Creates an object |

## Important Rules of Interfaces

1. An interface cannot be instantiated directly.
2. A class implements an interface using the `implements` keyword.
3. A class can implement multiple interfaces.
4. An interface can extend one or multiple interfaces.
5. Interface abstract methods are implicitly `public` and `abstract`.
6. Interface fields are implicitly `public`, `static`, and `final`.
7. Interfaces can contain default and static methods.
8. Private methods are supported in interfaces from Java 9.
9. A functional interface has exactly one abstract method.
10. An interface reference can refer to an object of an implementing class.

## Conclusion

Through these 13 experiments, we studied the concept of interfaces in Java, their implementation, inheritance, multiple inheritance, default and static methods, private methods, functional interfaces, lambda expressions, method references, polymorphism, and interface constants.

We also implemented a simple banking system to understand how multiple interfaces can be used to organize real-world application functionality.

These experiments provide a practical understanding of how interfaces support abstraction, loose coupling, code reusability, and polymorphism in Java.

---

**Practical:** 15 – Interface in Java  
**Language:** Java  
**Package:** `java.util.function` (used in Experiment 9 and related functional programming examples)

**Note:** Update the source filenames in this README if your actual filenames differ from the suggested `Task_1.java` to `Task_13.java` naming convention.