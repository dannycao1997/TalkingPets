package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // scanner object to get user input
        List<Pet> pets = new ArrayList<>(); // array list to store my pets

        System.out.println("Hello User, how many pets do you have?"); // ask user how many pets
        int howManyPets = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < howManyPets; i++){ // loop for # number of pets and asking questions about the pets
            System.out.println("Ok cool, what type of pet is pet #" + (i +1 ) + "? (reptile, fish, bird)");
            String petType = sc.nextLine();
            System.out.println("Next, what is the name of pet #" + (i + 1) + "?");
            String petName = sc.nextLine();

            switch (petType) {
                case "reptile":
                    pets.add(new Reptile(petName));
                    break;
                case "fish":
                    pets.add(new Fish(petName));
                    break;
                case "bird":
                    pets.add(new Bird(petName));
                    break;
                default:
                    System.out.println("Wrong supported types of pets");
                    break;
            }
        }
        for(Pet pet : pets){
            System.out.println(pet.getPetName() + " say " + pet.speak());
        }
    }
}
