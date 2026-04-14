# Virtual Zoo: Basic Method Overriding (JavaBasics_Task_312_V0.1)

## 📖 Description
In object-oriented programming, a subclass can provide a specific implementation of a method that is already defined in its superclass. This project demonstrates **Method Overriding**. By defining a `makeSound()` method in the `Animal` class and then redefining it in the `Dog` class, we ensure that when we call this method on a `Dog` object, the more specific "Woof!" is executed instead of the generic "Animal makes sound." This allows for specialized behavior while maintaining a consistent interface.

## 📋 Requirements Compliance
- **Inheritance Structure**: Established a clear Parent-Child relationship between `Animal` and `Dog`.
- **Method Overriding**: Correctly used the same method signature in the subclass to replace the parent behavior.
- **Object Instantiation**: Created a concrete `Dog` object to verify the overridden method call.
- **Clean Code principles**: Followed standard naming conventions and package organization.

## 🚀 Architectural Stack
- Java 8+ (Inheritance, Method Overriding, OOP)

## 🏗️ Implementation Details
- **Animal**: The base class providing the default "sound" contract.
- **Dog**: The specialized subclass that barks.
- **ZooLauncherApp**: The execution entry point for the simulation.

## 📋 Expected result
```text
Woof!
```

## 💻 Code Example

Project Structure:

    JavaBasics_Task_312/
    ├── src/
    │   └── com/yurii/pavlenko/
    │                 ├── app/
    │                 │   └── ZooLauncherApp.java
    │                 └── zoo/
    │                     ├── dog/
    │                     │   └── Dog.java
    │                     └── Animal.java
    ├── LICENSE
    ├── TASK.md
    ├── THEORY.md
    └── README.md

Code
```java
package com.yurii.pavlenko.app;

import com.yurii.pavlenko.zoo.dog.Dog;

public class ZooLauncherApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
```
```java
package com.yurii.pavlenko.zoo;

public class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound.");
    }
}
```
```java
package com.yurii.pavlenko.zoo.dog;

import com.yurii.pavlenko.zoo.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
