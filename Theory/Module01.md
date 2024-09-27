# Module 1: Introduction to Java and OOP

### Overview:

In this module, we will introduce the fundamentals of Java programming, focusing on its syntax, structure, and key features. We’ll also explore the difference between procedural programming and object-oriented programming (OOP), a core concept of this course. By the end of this module, you’ll have a good understanding of Java basics and how OOP differs from traditional procedural programming.

---

### Key Concepts:

1. Java as a Programming Language:

    - **Compilation:** Java code is written in .java files, which are compiled into bytecode using the **Java Compiler** (*javac*). This bytecode can then be executed by the **Java Virtual Machine** (**JVM**), which makes Java platform-independent.
    - **JDK (Java Development Kit):** Contains tools for developing Java programs, including the Java Compiler (*javac*) and Java Runtime Environment (JRE).

2. OOP vs. Procedural Programming:

    - **Procedural Programming:** Programs are structured as a sequence of instructions. Example languages include C and Pascal.
    - **OOP:** Programs are structured around objects that represent real-world entities. OOP promotes code reusability, modularity, and scalability.

3. Benefits of OOP:

    - **Code Reusability:** Write code once and use it in multiple places.
    - **Modularity:** Code is organized in classes, making it easy to maintain.
    - **Scalability:** OOP allows for expanding functionality without rewriting the entire code.

---

## 1. What is Java?

Java is a **high-level**, **object-oriented** programming language developed by Sun Microsystems (now owned by Oracle). It is **platform-independent**, meaning you can write code once and run it anywhere with a JVM.

**Example:** Java syntax is straightforward. Here’s a simple "Hello World" example to demonstrate its structure:

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```

## 2. Variables, Data Types, and Control Structures

- **Variables:** Containers to store data.
```
int age = 25;
String name = "John";
```

- **Data Types:** Java has various data types, such as *int*, *double*, *boolean*, *char*, and *String*.
```
int number = 10;
double price = 19.99;
boolean isStudent = true;
```
- **Control Structures:** Use *if-else* and loops to control the flow of the program.
```
int score = 85;
if (score >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```
- **Loops in Java:**
```
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

## 3. Functions vs. Methods in Java:

In Java, functions are referred to as **methods**. A method is a block of code that performs a specific task. Unlike standalone functions in procedural languages, methods in Java are always associated with a class.

```
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

## 4. Introduction to Objects and Classes:

- **Classes** are blueprints for creating objects. A class defines the properties (variables) and behaviors (methods) of an object.
- **Objects** are instances of a class that contain actual values.

Example:
```
public class Car {
    // Attributes
    String model;
    int year;

    // Method
    public void startEngine() {
        System.out.println("Engine started!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object (instance of the Car class)
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.startEngine();
    }
}
```

- In this example, *Car* is the class, and *myCar* is an object of that class.

---

## Exercises

### Exercise 1: "Hello World" Program

- Write a simple program that prints "Hello, World!" to the console.
- Task:
    - Create a new class called *HelloWorld*.
    - Inside it, define the *main* method and use *System.out.println* to print "Hello, World!".


### Exercise 2: Create a Basic Class

- Create a class called Person with the following:
    - Attributes: name, age.
    - Method: introduceYourself() that prints a message using the name and age attributes.
- Task:
    - Define the class Person.
    - Instantiate an object of Person and call the method introduceYourself().

---

## Key Takeaways:

- Java is a versatile language that follows the OOP paradigm.
- Variables, control structures, and methods form the foundation of any Java program.
- Objects and classes are at the core of OOP, encapsulating data and behaviors.

---

By completing this module, you should now have a good grasp of Java’s basic structure and how OOP principles like objects and classes work. In the next module, we will dive deeper into defining and using classes and objects, along with access modifiers.