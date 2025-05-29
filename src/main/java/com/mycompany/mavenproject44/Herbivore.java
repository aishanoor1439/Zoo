
package com.mycompany.mavenproject44;

public class Herbivore extends Animal{
    private String[] favoritePlants;
    
    public Herbivore(String name, int age, String species, String[] favoritePlants) {
        super(name, age, species);
        this.favoritePlants = favoritePlants;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Herbivorous Animal:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Species: " + species);
        System.out.print("Favorite Plants: ");
        for (String plant : favoritePlants) {
            System.out.print(plant + " ");
        }
        System.out.println();
    }
    
    @Override
    public void performActivity() {
        System.out.println(name + " the " + species + " is grazing peacefully.");
    }
}
