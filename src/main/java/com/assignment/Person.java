package com.assignment;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    // Constructor without dog
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.dog = Optional.empty();  // No dog by default
    }

    // Constructor with dog
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.of(dog);  // Dog is present
    }

    // Method to check if the person has an old dog
    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    // Method to change dog's name
    public void changeDogsName(String newName) {
        dog.orElseThrow(() -> new RuntimeException("No dog found"))
           .setName(newName);
    }

    // Method to get dog's name
    public String getDogsName() {
        return dog.map(Dog::getName).orElse("No dog found");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = Optional.of(dog);
    }
}
