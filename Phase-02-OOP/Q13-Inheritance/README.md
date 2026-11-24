# Practical 13 – Area Calculation Using Interface

## 1. Objective

To understand and implement interfaces in Java by calculating the areas of different geometrical shapes. This practical demonstrates interface implementation, constant variables, static nested classes, and mathematical operations.

## 2. Introduction

An interface in Java is a reference type used to define a contract that classes can implement.

A class uses the `implements` keyword to implement an interface.

Interfaces help achieve:
- Abstraction
- Common structure across different classes
- Loose coupling
- Multiple inheritance of type
- Code organisation and reusability

In this practical, an interface named `Size` contains common dimensions used by different geometrical shape classes.

## 3. Concepts Used

1. **Interface:** Defines common dimensions for different shapes.
2. **Implements:** Allows a class to implement an interface.
3. **Interface Variables:** Variables declared inside an interface are implicitly `public`, `static`, and `final`.
4. **Static Nested Classes:** Classes declared inside another class using the `static` keyword.
5. **Methods:** Each shape class defines its own area-calculation method.
6. **Math.PI:** Provides the mathematical constant π.
7. **Math.pow():** Calculates the power of a number.
8. **System.out.printf():** Displays formatted output.

## 4. Program Description

The program calculates the area or total surface area of five geometrical shapes.

The interface `Size` contains the following dimensions:

| Variable | Value |
|---|---:|
| LENGTH | 4 |
| WIDTH | 2 |
| HEIGHT | 5 |
| RADIUS | 3 |

The program contains five independent shape classes:

- `Rectangle`
- `Square`
- `Cuboid`
- `Cube`
- `Circle`

Each class implements the `Size` interface and defines its own calculation method.

## 5. Mathematical Formulas

| Shape | Formula | Calculation | Result |
|---|---|---|---:|
| Rectangle | Length × Width | 4 × 2 | 8 |
| Square | Side × Side | 4 × 4 | 16 |
| Cuboid | 2(lb + bh + hl) | 2(8 + 10 + 20) | 76 |
| Cube | 6 × Side² | 6 × 16 | 96 |
| Circle | π × Radius² | π × 9 | 28.27 |

**Note:** Cuboid and cube calculations represent total surface area, while rectangle, square and circle calculations represent ordinary area.

## 6. Class Structure

### 1. Area

The main class contains the main method and all the nested shape classes.

### 2. Size

An interface that contains common dimensions required for geometrical calculations.

### 3. Rectangle

Implements the `Size` interface and calculates the area of a rectangle.

### 4. Square

Implements the `Size` interface and calculates the area of a square.

### 5. Cuboid

Implements the `Size` interface and calculates the total surface area of a cuboid.

### 6. Cube

Implements the `Size` interface and calculates the total surface area of a cube.

### 7. Circle

Implements the `Size` interface and calculates the area of a circle.

## 7. Expected Output

```text
Area of Rectangle = 8
Area of Square = 16
Surface Area of Cuboid = 76
Surface Area of Cube = 96
Area of Circle = 28.27
```

## 8. Important Java Keywords and Methods

| Keyword / Method | Purpose |
|---|---|
| `interface` | Declares an interface. |
| `implements` | Implements an interface in a class. |
| `static` | Declares a static member or nested class. |
| `public` | Provides public access. |
| `final` | Prevents reassignment of a variable. |
| `int` | Declares integer variables. |
| `double` | Declares decimal-valued variables. |
| `Math.PI` | Provides the value of π. |
| `Math.pow()` | Calculates powers of numbers. |
| `System.out.println()` | Displays output. |
| `System.out.printf()` | Displays formatted output. |

## 9. Conclusion

Through this practical, we learned how to implement interfaces in Java and use common interface constants across multiple classes.

We also learned how to calculate the areas and surface areas of different geometrical shapes using mathematical formulas.

This practical demonstrates abstraction, interface implementation, static nested classes, and code organisation in Java.