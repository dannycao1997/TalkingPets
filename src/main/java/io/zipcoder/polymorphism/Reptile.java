package io.zipcoder.polymorphism;

public class Reptile extends Pet {
    public Reptile(String petName) { // fish subclass, type of pet
        super(petName); // calling the parent class Pet constructor
    }
    @Override
    public String speak() {
        return "hssssh hsssh"; // return string : pet speak
    }
}
