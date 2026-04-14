package com.yurii.pavlenko.zoo.dog;

import com.yurii.pavlenko.zoo.Animal;

/**
 * Specialized class representing a dog.
 */
public class Dog extends Animal {

    /**
     * Overrides the animal's sound with a specific bark.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}