# Armstrong Number – Java Practical

## Objective
To write Java programs to check whether a given number is an Armstrong number using three different approaches: iterative positional digit extraction, recursion, and an iterative method using a temporary variable.

## What is an Armstrong Number?

An Armstrong number is a number equal to the sum of its digits, each raised to the power of the total number of digits in that number.

**Examples:**
- 153 = 1³ + 5³ + 3³ = 153
- 370 = 3³ + 7³ + 0³ = 370
- 9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474

## Approaches Implemented

### 1. Iterative Approach – Positional Digit Extraction
**File:** `Q2FirstApproach.java`

- Counts the total number of digits using a temporary variable.
- Calculates the initial positional divisor.
- Extracts digits from left to right using division and modulus operations.
- Uses `Math.pow()` to raise each digit to the power of the digit count.
- Adds the calculated values and compares the sum with the original number.

### 2. Recursive Approach – Positional Digit Extraction
**File:** `Q2SecondApproach.java`

- Counts the total number of digits using a temporary variable.
- Uses recursion to extract digits from left to right.
- Uses a positional divisor that increases with each recursive call.
- Calculates the power of each extracted digit using `Math.pow()`.
- Returns the accumulated sum through recursive calls.
- Compares the final sum with the original number.

### 3. Iterative Approach – Repeated Digit Extraction
**File:** `Q2ThridApproach.java`

- Uses `String.valueOf(n).length()` to determine the number of digits.
- Extracts digits from right to left using modulus and division.
- Calculates the power of each digit using `Math.pow()`.
- Accumulates the sum in a variable.
- Uses a Boolean method to return whether the number is Armstrong.

## Sample Test Cases

| Input | Expected Output |
|---|---|
| 0 | Armstrong |
| 1 | Armstrong |
| 153 | Armstrong |
| 370 | Armstrong |
| 371 | Armstrong |
| 407 | Armstrong |
| 9474 | Armstrong |
| 123 | Not Armstrong |
| 125 | Not Armstrong |

## Java Concepts Covered

- Scanner Class
- Static Methods
- While Loop and For Loop
- Conditional Statements
- Recursion
- Type Casting
- Math.pow() Method
- String.valueOf() Method
- Boolean Return Type
- Modulus and Division Operations

## Technologies Used
- Programming Language: Java
- IDE: IntelliJ IDEA

## Project Structure

```text
02-Armstrong-Number/
├── Q2FirstApproach.java
├── Q2SecondApproach.java
├── Q2ThridApproach.java
└── README.md
```

## Learning Outcome

Practiced different ways of extracting digits, implementing recursion, calculating digit powers, and checking Armstrong numbers using Java.