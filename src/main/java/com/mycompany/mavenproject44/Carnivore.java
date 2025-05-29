
package com.mycompany.mavenproject44;

public class Carnivore extends Animal{
    private String preferredMeat;
    
    public Carnivore(String name, int age, String species, String preferredMeat) {
        super(name, age, species);
        this.preferredMeat = preferredMeat;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Carnivorous Animal:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Species: " + species);
        System.out.println("Preferred Meat: " + preferredMeat);
    }
    
    @Override
    public void performActivity() {
        System.out.println(name + " the " + species + " is hunting for prey!");
    }
}
