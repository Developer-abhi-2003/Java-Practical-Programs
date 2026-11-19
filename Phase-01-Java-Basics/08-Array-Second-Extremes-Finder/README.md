# Array Second Extremes Finder

## Problem Statement
Write a Java program to find the second-largest and second-smallest distinct elements in an integer array.

## Description
This program identifies the second-largest and second-smallest distinct values in an integer array.

It uses comparison operations to maintain four variables:
- Largest
- Second Largest
- Smallest
- Second Smallest

The program also handles duplicate values by ensuring that the second-largest and second-smallest elements are distinct from the largest and smallest elements.

## Concepts Used
- Java Arrays
- Array Traversal
- For Loop
- Conditional Statements (`if-else`)
- Comparison Operators
- `Integer.MAX_VALUE`
- `Integer.MIN_VALUE`
- Scanner Class for User Input
- Distinct Elements

## Approaches Implemented

### Approach 1 – Initial Approach
An initial implementation using nested loops to identify the second-largest and second-smallest values.

### Approach 2 – Single Traversal Approach
An improved implementation that finds the largest, second-largest, smallest and second-smallest distinct elements using a single traversal of the array.

This approach updates the second-largest and second-smallest values whenever a new candidate is found.

## Sample Input
```text
Enter number of elements: 6

Enter the elements:
10 20 30 40 50 60
```

## Sample Output
```text
Second largest  : 50
Second smallest : 20
```

## Complexity Analysis

### Approach 1
- Uses nested loops.
- Time Complexity: O(n²) in the worst case.
- Auxiliary Space Complexity: O(1).

### Approach 2
- Traverses the array only once.
- Time Complexity: O(n).
- Auxiliary Space Complexity: O(1).

## Java Source Code

- `src/Q8_2ndLargest_2ndSmallestNumber.java`
- `src/Q8_SecondLargestSmallest_Approach2.java`

## Important Considerations
- Duplicate elements should not be counted as separate values.
- Negative numbers must be handled correctly.
- An array containing fewer than two distinct values does not have a valid second-largest or second-smallest distinct element.
- Input size should be validated before creating the array.

## Learning Outcome
Learned how to find second-order minimum and maximum values in an array, handle duplicate elements, and improve an algorithm from nested-loop traversal to a single-pass approach.