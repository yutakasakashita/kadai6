package com.practise.Dog;

public class Dog {

    private String name;

    private int age;

    private String dogBreed;

    public Dog(String name, int age, String dogBreed) {
        this.name = name;
        this.age = age;
        this.dogBreed = dogBreed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDogBreed() {
        return dogBreed;
    }
}
