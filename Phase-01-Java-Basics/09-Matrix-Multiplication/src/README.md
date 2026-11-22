# Practical 9: Matrix Multiplication in Java

## Aim
To write a Java program to perform multiplication of two matrices using two-dimensional arrays.

## Concept
Matrix multiplication is a mathematical operation in which two matrices are multiplied to produce a resultant matrix.

Each element of the resultant matrix is calculated by multiplying the corresponding elements of a row of the first matrix with a column of the second matrix and adding their products.

### Condition for Matrix Multiplication
Matrix multiplication is possible only when:

**Number of columns in Matrix A = Number of rows in Matrix B.**

If Matrix A has dimensions `m × n` and Matrix B has dimensions `n × p`, then the resultant matrix will have dimensions `m × p`.

## Algorithm
1. Start the program.
2. Read the size of the square matrices from the user.
3. Declare three two-dimensional arrays:
    - Matrix A
    - Matrix B
    - Resultant Matrix C
4. Read the elements of Matrix A.
5. Read the elements of Matrix B.
6. Use three nested loops to perform matrix multiplication:
    - The outer loop selects the row of Matrix A.
    - The middle loop selects the column of Matrix B.
    - The inner loop calculates the sum of products.
7. Store the calculated values in the resultant matrix.
8. Display the resultant matrix.
9. Stop the program.

## Formula

For two matrices A and B, each element of the resultant matrix C is calculated as:

`C[i][j] = Σ (A[i][k] × B[k][j])`

## Example

**Input Matrix A:**

```text
1  2
3  4
```

**Input Matrix B:**

```text
5  6
7  8
```

**Resultant Matrix:**

```text
19  22
43  50
```

### Calculation

`C[0][0] = (1 × 5) + (2 × 7) = 19`

`C[0][1] = (1 × 6) + (2 × 8) = 22`

`C[1][0] = (3 × 5) + (4 × 7) = 43`

`C[1][1] = (3 × 6) + (4 × 8) = 50`

## Java Concepts Used
- Two-dimensional arrays
- Nested for loops
- Matrix multiplication
- Array indexing
- User input using Scanner

## Time and Space Complexity
- **Time Complexity:** O(n³) for two n × n