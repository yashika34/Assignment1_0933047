package com.assignment;
public class Dog {
    private String name;
    private Integer age;

    // Constructor
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public Integer getAge() {
        return age;
    }

    // Setter for age
    public void setAge(Integer age) {
        this.age = age;
    }
}
