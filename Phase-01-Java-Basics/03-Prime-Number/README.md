# Prime Number – Java Practical

## Objective
To write Java programs to check whether a number is prime and display prime numbers within a given range using different approaches.

## What is a Prime Number?

A prime number is a natural number greater than 1 that has exactly two distinct positive factors: 1 and itself.

**Examples:**
- 2 – Prime
- 3 – Prime
- 7 – Prime
- 9 – Not Prime
- 15 – Not Prime
- 17 – Prime

## Approaches Implemented

### 1. Approach 1 – Divisibility Check
**File:** `Q3FirstApproach.java`

- Handles numbers less than or equal to 1.
- Recognizes 2, 3 and 5 as prime numbers.
- Checks divisibility by 2, 3 and 5.
- Classifies the remaining numbers based on these checks.

### 2. Approach 2 – Boolean Method with Trial Division
**File:** `Q3SecondApproach.java`

- Uses a separate Boolean method to check primality.
- Handles numbers less than or equal to 1.
- Eliminates even numbers greater than 2.
- Checks divisibility using a loop.
- Returns the result through a Boolean value.

### 3. Approach 3 – Display Prime Numbers from 0 to 100
**File:** `Q3ThirdApproach.java`

- Iterates through numbers from 0 to 100.
- Skips numbers less than or equal to 1.
- Recognizes 2, 3 and 5 separately.
- Eliminates numbers divisible by 2, 3, 5, 7 or 11.
- Displays the remaining numbers.

## Java Concepts Covered

- Scanner Class
- Static Methods
- Boolean Return Type
- For Loop
- Conditional Statements
- Modulus Operator
- Early Return
- Trial Division

## Technologies Used
- Programming Language: Java
- IDE: IntelliJ IDEA

## Learning Outcome

Practiced prime-number checking, divisibility testing, Boolean methods, loops and conditional logic.