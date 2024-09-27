package Solutions;

public class Animal {
    // Private instance variables
    private String species;
    private int age;

    // Constructor using 'this' keyword
    public Animal(String species, int age) {
        this.species = species;  // 'this' refers to the instance variable
        this.age = age;
    }

    // Method to display animal information
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }
}