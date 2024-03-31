package io.zipcoder.polymorphism;

abstract class Pet { //made abstract pet class
    private String petName;

    public Pet(String petName){
        this.petName = petName;
    }

    public String getPetName(){ // petName getter
        return petName;
    }

    public void setPetName(String petName){ // petName setter
        this.petName = petName;
    }

    public abstract String speak(); // speak method that each subclass overrides
    }
