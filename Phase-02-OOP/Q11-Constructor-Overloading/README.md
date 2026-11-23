# Practical 11 – Constructor Overloading in Java

## Aim
To write a Java program to demonstrate the concept of constructor overloading.

## Description
Constructor Overloading is a feature of Java that allows a class to have multiple constructors with different parameter lists.

Each constructor can initialize objects differently depending on the arguments supplied during object creation.

The overloaded constructors can differ in:
- Number of parameters.
- Data types of parameters.
- Sequence of parameter data types.

Java selects the appropriate constructor based on the arguments passed during object creation.

## Program
`Main.java`

## Concepts Used
1. Constructors
2. Constructor Overloading
3. Default Constructor
4. Parameterized Constructor
5. Instance Variables
6. `this` Keyword
7. Constructor Chaining using `this()`
8. Object Creation

## Expected Output

```text
Student Details:

Name: Unknown
Age: 0
Course: Not Assigned
-------------------------
Name: Rahul
Age: 0
Course: Not Assigned
-------------------------
Name: Aman
Age: 21
Course: Not Assigned
-------------------------
Name: Abhishek
Age: 24
Course: BCA
-------------------------
```

## Key Learning
- Constructors have the same name as their class.
- Constructors do not have a return type.
- Multiple constructors can exist in the same class through constructor overloading.
- The `this` keyword refers to the current object.
- The `this()` statement is used to call another constructor in the same class.
- Constructor chaining helps avoid repetitive initialization code.

## Conclusion
Successfully implemented a Java program to demonstrate constructor overloading using multiple constructors, instance variables, the `this` keyword and constructor chaining.