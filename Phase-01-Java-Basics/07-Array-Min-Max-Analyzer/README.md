# Array Min-Max Analyzer

## Problem Statement
Write a Java program to find the largest and smallest elements present in an integer array.

## Description
This program traverses an integer array and identifies its minimum and maximum values using comparison operations.

It uses `Integer.MAX_VALUE` and `Integer.MIN_VALUE` to initialize the smallest and largest variables.

## Concepts Used
- Java Arrays
- Array Traversal
- For Loop
- Conditional Statements (`if`)
- Comparison Operators
- Integer Constants (`Integer.MAX_VALUE`, `Integer.MIN_VALUE`)

## Approach
1. Declare and initialize an integer array.
2. Initialize the `smallest` variable with `Integer.MAX_VALUE`.
3. Initialize the `largest` variable with `Integer.MIN_VALUE`.
4. Traverse the array using a for loop.
5. Compare each element with the current smallest and largest values.
6. Update the variables whenever a smaller or larger element is found.
7. Display the final results.

## Sample Input
```text
Array: {11, 22, 33, 44, 55}
```

## Sample Output
```text
Smallest = 11
Largest = 55
```

## Complexity Analysis
- **Time Complexity:** O(n) – The array is traversed once.
- **Auxiliary Space Complexity:** O(1) – Only two additional variables are used.

## Java Source Code
`src/Q7LargestSmallestNumber.java`

## Learning Outcome
Learned how to traverse an array and identify its minimum and maximum elements efficiently using a single loop.