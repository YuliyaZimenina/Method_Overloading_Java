# Overloaded Methods - Java Training Project

An educational project that demonstrates method overloading in Java and shows how automatic type conversions affect overloaded method resolution.

## Table of contents
1. [Description](#description)
2. [Technologies](#technologies)
3. [Installation and Running](#installation-and-running)
4. [Author](#author)
5. [Code Example](#code-example)
6. [Screenshots](#screenshots)

## Description

This repository contains a Java console project that explains how method overloading works in
Java.
It also demonstrates how Java handles automatic type conversions when selecting the appropriate 
overloaded method.

### Purpose

The project was created as a learning playground for mastering the following Java concepts:
- Method overloading
- Returning different data types
- Automatic type conversion in overloaded methods

### Topics and Example

1. **Overloaded Methods** (`overloaded_methods`):
- Overloading a method with no parameters
- Overloading with one parameter (`int`)
- Overloading with two parameters (`int, int`)
- Overloading with two parameters (`double, double`)

2. **Automanic Type Conversion in Overloaded Methods** (`automanic_type_conversion_in_overloaded_methods`):
- Passing `int`, `double`, `byte`, `short`, and `float` to overloaded methods
- Demonstrating how type promotion works (`byte -> int`, `short -> int`, `float -> double`)

## Technologines

- **Java SE** (`version 17`)

## Installation and Running

1. Clone the repository:
```bash

git clone https://github.com/YuliyaZimenina/Method_Overloading_Java.git

```

2. Open the project in your favorite IDE (Eclipse, IntelliJ IDEA, etc.) or go to the project folder:
   
```bash

cd OverloadedMethods

```

3. Make sure **Java 17** is set as the project SDK
   
4. Compile all classes or run demo-classes (`MethodOverloadedDemo.java` or `SecondOverloadedDemo.java` in your IDE or command line.

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Code Example

```java

// Example: Overloading methods with different signatures
public class Overload {
    void overloadDemo() {
        System.out.println("No parameters");
    }

    void overloadDemo(int a) {
        System.out.println("One parameter of type int: a = " + a);
    }

    int overloadDemo(int a, int b) {
        System.out.println("Two int parameters: a = " + a + ", b = " + b);
        return a + b;
    }

    double overloadDemo(double a, double b) {
        System.out.println("Two double parameters: a = " + a + ", b = " + b);
        return a + b;
    }
}

```

## Screenshots
