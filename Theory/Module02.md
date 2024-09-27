# Module 2: Classes and Objects

### Overview:

In this module, we will dive deeper into two of the core building blocks of Object-Oriented Programming (OOP): classes and objects. You’ll learn how to define classes, create objects, and work with instance variables (attributes) and methods (behaviors). Additionally, we’ll explore the importance of access modifiers (private, public, and protected), which help control access to class members and promote encapsulation.

---

### Key Concepts:

1. Defining Classes and Objects:

    - A **class** is a blueprint for creating objects. It defines the attributes (instance variables) and behaviors (methods) that the objects of the class will have.
    - An **object** is an instance of a class, created using the *new* keyword.

2. Instance Variables and Methods:

    - **Instance variables** (attributes) are the data members of a class, representing the properties of an object.
    - **Methods** (functions within classes) define behaviors that objects of the class can perform.

3. Access Modifiers:

    - **Public:** Accessible from anywhere.
    - **Private:** Only accessible within the class.
    - **Protected:** Accessible within the class, its subclasses, and classes in the same package.

4. The *this* Keyword:

    - Used to refer to the current instance of a class. It is often used when an instance variable is shadowed by a method or constructor parameter with the same name.

---

## 1. Defining a Java Class:

- A class typically contains instance variables and methods. You define a class using the *class* keyword.

Example:
```
public class Car {
    // Instance variables
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Year: " + year);
    }
}
```

## 2. Creating and Using Objects:

- **Objects** are created using the ***new*** keyword. After creating an object, you can access its instance variables and methods using the dot ( . ) operator.

Example:
```
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2022;
        myCar.displayInfo();  // Output: Car model: Toyota, Year: 2022
    }
}
```

## 3. Access Modifiers (private, public, protected):

- **Public** members can be accessed from any class.
- **Private** members are only accessible within the class they are defined in.
- **Protected** members are accessible within the same package or by subclasses.

Example:
```
public class Person {
    // Public variable (accessible from anywhere)
    public String name;

    // Private variable (only accessible within this class)
    private int age;

    // Public method to set the value of the private age variable
    public void setAge(int age) {
        this.age = age;  // Using 'this' keyword to refer to the instance variable
    }

    // Public method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

## 4. Using the *this* Keyword:

- The ***this*** keyword refers to the current object instance. It is commonly used to differentiate between instance variables and method parameters that have the same name.

Example:
```
public class Person {
    String name;
    int age;

    // Constructor using 'this' to refer to instance variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + this.name + " and I am " + this.age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object using the constructor
        Person person1 = new Person("John", 25);
        person1.introduce();  // Output: Hi, I am John and I am 25 years old.
    }
}
```

## Exercises

### Exercise 3: Define a Student Class

- Objective: Create a class Student with two attributes: name (String) and age (int).
- Add methods to:
    - Set the name (setName(String name)).
    - Set the age (setAge(int age)).
    - Display the student’s information (displayInfo()).

---

### Exercise 4: Create an Animal Class with Constructor and this Keyword

- Objective: Update the class to be called Animal. It will have two attributes: species (String) and age (int). Use a constructor that takes these attributes as parameters.

- Use the *this* keyword to differentiate between instance variables and constructor parameters.

## Key Takeaways:

- Classes and objects are fundamental in OOP, representing real-world entities.
- Access modifiers help control access to variables and methods, promoting encapsulation.
- The *this* keyword is used to refer to the current object, especially when variable names are shadowed by method or constructor parameters.

---

By completing this module, you should now be comfortable with creating and using classes and objects in Java. You’ve also learned how to use access modifiers to control access to class members and the role of the this keyword. Next, we will explore Encapsulation and Constructors in more detail to deepen your understanding of OOP principles.