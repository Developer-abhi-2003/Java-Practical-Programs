# Palindrome Number – Java Practical

## Objective
To write a Java program to check whether a given number is a Palindrome.

## What is a Palindrome Number?

A Palindrome number is a number that remains the same when its digits are reversed.

**Examples:**
- 121 – Palindrome
- 1331 – Palindrome
- 12321 – Palindrome
- 123 – Not a Palindrome

## Approach Implemented

### Optimized Approach – Half Number Reversal

- Checks whether the number is negative or ends with zero.
- Reverses only half of the given number.
- Compares the remaining first half with the reversed second half.
- Avoids reversing the entire number.

## Complexity Analysis

- **Time Complexity:** O(d), where d is the number of digits.
- **Auxiliary Space Complexity:** O(1).

## Java Concepts Covered

- Scanner Class
- Conditional Statements
- While Loop
- Modulus and Division Operations
- Number Reversal
- Time and Space Complexity

## Technologies Used
- Programming Language: Java
- IDE: IntelliJ IDEA

## Project Structure

```text
01-Palindrome-Number/
├── PalindromeOptimized.java
└── README.md
```

## Learning Outcome

Practiced number manipulation, digit extraction, optimized palindrome checking, and basic time and space complexity analysis.