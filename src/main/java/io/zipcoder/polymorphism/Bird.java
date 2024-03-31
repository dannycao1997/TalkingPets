package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(String petName) { // fish subclass, type of pet
        super(petName); // calling the parent class Pet constructor
    }
    @Override
    public String speak() {
        return "quack quack"; // return string : pet speak
    }
}
