package Solutions;

public class Student {
    // Private instance variables
    private String name;
    private int age;

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}