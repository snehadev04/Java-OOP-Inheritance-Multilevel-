# Java-OOP-Inheritance (Multilevel)
This repository showcases the concept of multilevel inheritance in Java through a series of classes that build upon each other to perform basic and advanced arithmetic operations.

Overview
Java supports object-oriented programming (OOP) principles, including inheritance, where classes can inherit methods and properties from parent classes. 
Multilevel inheritance extends this concept by allowing derived classes to inherit from other derived classes, forming a hierarchical structure of classes.

## Classes and Their Functionality
1) calc Class:

Defines basic arithmetic operations such as addition and subtraction.
Methods:
int add(int n1, int n2) - Adds two integers.
int sub(int n1, int n2) - Subtracts one integer from another.

2) advcal Class (extends calc):

Extends the calc class to include more advanced operations like multiplication and division.
Methods:
int multi(int n1, int n2) - Multiplies two integers.
int div(int n1, int n2) - Divides one integer by another.

3) power Class (extends advcal):

Further extends advcal to incorporate power calculation functionality using the Math.pow() method.
Methods:
double po(double n1, double n2) - Calculates one number raised to the power of another.
 
4) inher Class (Main Class):

Contains the main method to demonstrate the usage of the multilevel inheritance structure.
Creates an object of the power class to access methods inherited from calc, advcal, and power.

## How to Use
To run the inher class and see the results of multilevel inheritance in action:

Ensure you have Java installed on your machine.
Compile the inher.java file using javac inher.java.
Run the compiled class using java inher.

## Conclusion
This repository serves as an educational example of how Java supports multilevel inheritance, allowing classes to inherit and extend functionality from parent classes. 
Each subsequent class (advcal and power) builds upon the capabilities of its predecessors (calc and advcal), demonstrating the power and flexibility of OOP principles in Java programming.
