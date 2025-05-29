
package com.mycompany.mavenproject44;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String species;
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    
    public abstract void displayDetails();
    public abstract void performActivity();
    
    public String getName() {
        return name;
    }
}
