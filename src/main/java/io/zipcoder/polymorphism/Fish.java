package io.zipcoder.polymorphism;

public class Fish extends Pet {
    public Fish(String petName) { // fish subclass, type of pet
        super(petName); // calling the parent class Pet constructor
    }
    @Override
    public String speak() {
        return "bloop bloop"; // return string : pet speak
    }
}
