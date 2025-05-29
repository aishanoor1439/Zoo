
package com.mycompany.mavenproject44;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper implements FeedingSchedule{
    private String name;
    private String contactInfo;
    private List<Animal> assignedAnimals;
    private List<String> feedingTimes;
    
    public ZooKeeper(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.assignedAnimals = new ArrayList<>();
        this.feedingTimes = new ArrayList<>();
    }
    
    public void assignAnimal(Animal animal) {
        assignedAnimals.add(animal);
    }
    
    @Override
    public void addFeedingTime(String time) {
        feedingTimes.add(time);
    }
    
    @Override
    public void performFeeding() {
        System.out.println(name + " is feeding the animals:");
        for (Animal animal : assignedAnimals) {
            System.out.println("Feeding " + animal.getName());
        }
    }
    
    public void displayAssignedAnimals() {
        System.out.println("Animals assigned to " + name + ":");
        for (Animal animal : assignedAnimals) {
            animal.displayDetails();
            System.out.println();
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getContactInfo() {
        return contactInfo;
    }
}
