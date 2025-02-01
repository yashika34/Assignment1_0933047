package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testChangeDogsNameNoDog() {
        Person person = new Person("John", 30);  // Person without a dog
        
        // Assert that the RuntimeException is thrown when no dog is present
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.changeDogsName("Buddy");
        });
        
        // Check that the exception message is as expected
        assertEquals("No dog found", exception.getMessage());
    }

    @Test
    void testChangeDogsNameWithDog() {
        Dog dog = new Dog("Max", 5);
        Person person = new Person("John", 30, dog);  // Person with a dog

        // Change dog's name
        person.changeDogsName("Buddy");

        // Assert the dog's name was changed
        assertEquals("Buddy", person.getDogsName());
    }

    @Test
    void testGetDogsNameNoDog() {
        Person person = new Person("John", 30);  // Person without a dog

        // Assert that the dog's name is returned as "No dog found"
        assertEquals("No dog found", person.getDogsName());
    }

    @Test
    void testGetDogsNameWithDog() {
        Dog dog = new Dog("Max", 5);
        Person person = new Person("John", 30, dog);  // Person with a dog

        // Assert the correct dog's name is returned
        assertEquals("Max", person.getDogsName());
    }

    @Test
    void testHasOldDogTrue() {
        Dog dog = new Dog("Old Dog", 12);  // Dog is older than 10 years
        Person person = new Person("John", 30, dog);

        // Assert that the person has an old dog
        assertTrue(person.hasOldDog());
    }

    @Test
    void testHasOldDogFalse() {
        Dog dog = new Dog("Young Dog", 5);  // Dog is younger than 10 years
        Person person = new Person("John", 30, dog);

        // Assert that the person does not have an old dog
        assertFalse(person.hasOldDog());
    }
}
