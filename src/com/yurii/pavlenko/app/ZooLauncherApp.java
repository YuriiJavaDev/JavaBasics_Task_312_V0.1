package com.yurii.pavlenko.app;

import com.yurii.pavlenko.zoo.dog.Dog;

/**
 * Entry point for the zoo simulation.
 */
public class ZooLauncherApp {

    public static void main(String[] args) {
        // Create a specific dog object
        Dog dog = new Dog();

        // Call the method to see the overridden behavior in action
        dog.makeSound();
    }
}