
package com.mycompany.mavenproject44;

public class Mavenproject44 {

    public static void main(String[] args) {
        // Create animals
        Carnivore lion = new Carnivore("Simba", 5, "Lion", "Beef");
        Herbivore giraffe = new Herbivore("Melman", 8, "Giraffe", 
            new String[]{"Acacia leaves", "Fruits"});
        
        // Create zookeeper
        ZooKeeper keeper = new ZooKeeper("John Doe", "john@zoo.com");
        
        // Assign animals to zookeeper
        keeper.assignAnimal(lion);
        keeper.assignAnimal(giraffe);
        
        // Set feeding schedule
        keeper.addFeedingTime("09:00 AM");
        keeper.addFeedingTime("03:00 PM");
        
        // Display zoo information
        System.out.println("=== Zoo Management System ===");
        keeper.displayAssignedAnimals();
        
        // Perform activities
        System.out.println("=== Animal Activities ===");
        lion.performActivity();
        giraffe.performActivity();
        
        // Perform feeding
        System.out.println("\n=== Feeding Time ===");
        keeper.performFeeding();
    }
}
