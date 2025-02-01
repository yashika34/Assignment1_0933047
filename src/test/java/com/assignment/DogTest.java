package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void testDogConstructor() {
        Dog dog = new Dog("Buddy", 5);
        assertNotNull(dog);
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testSetName() {
        Dog dog = new Dog("Buddy", 5);
        dog.setName("Max");
        assertEquals("Max", dog.getName());
    }

    @Test
    public void testSetAge() {
        Dog dog = new Dog("Buddy", 5);
        dog.setAge(6);
        assertEquals(6, dog.getAge());
    }

    @Test
    public void testBark() {
        Dog dog = new Dog("Buddy", 5);  // Instantiate with a name and age
        dog.bark();  // Correct usage of the void method
        
        // Since we can't assert on void methods directly, it's enough that it runs without errors.
        // We would normally check the console output using a mock or log capturing framework.
    }
}
