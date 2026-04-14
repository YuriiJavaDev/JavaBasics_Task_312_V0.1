### Imagine you're creating a virtual zoo, and each animal in it needs to make its own unique sound.

#### - Start with a common template for all inhabitants. Create an Animal class with a void makeSound() method, which by default displays "Animal makes sound."

#### - Now it's time to add the most popular pet to your zoo—the dog. Create a Dog class that inherits from Animal. Obviously, a dog doesn't just "make a sound"; it barks! So, override the makeSound() method in the Dog class to display "Woof!"

#### - In your program's main method, create a Dog object—let this be your new virtual pet. Now "ask" it to make a sound by calling its makeSound() method. Your program should demonstrate that the dog has earned its unique voice by displaying "Woof!"

```java
public class Solution {
    public static void main(String[] args) {
        // Create a dog object—our zoo inhabitant
        Dog dog = new Dog();
        
        // Ask the dog to make a sound.
        // The overridden version should be output: "Woof!"
        dog.makeSound();
    }
}
```
