# Task 5 – Compile and Execute Package Programs Using Terminal

## Aim

To write, compile, and execute Java programs containing user-defined packages using the command-line terminal.

## Objectives

- To understand how to compile Java source files belonging to different packages.
- To learn the use of the `javac` compiler with the `-d` option.
- To understand how compiled `.class` files are organized into package directories.
- To learn how to execute a packaged Java class using its fully qualified class name.
- To understand the role of classpath (`-cp`) during program execution.

## Theory

In Java, packages are used to organize related classes and interfaces. When a Java program contains multiple packages, the source files must be compiled correctly so that the package structure is maintained.

Java provides two important commands for compiling and executing programs:

### 1. javac

`javac` is the Java compiler. It converts Java source code (`.java`) into bytecode (`.class`).

The `-d` option specifies the destination directory where the compiled class files will