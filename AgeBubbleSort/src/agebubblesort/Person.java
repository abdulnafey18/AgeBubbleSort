/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agebubblesort;

/**
 *
 * @author abdul.nafey18
 */
public class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get method for the name and the age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Compares persons based on their age
    @Override
    public int compareTo(Person otherPerson) {
        // Sort by age in descending order
        return Integer.compare(otherPerson.age, this.age);
    }

    // Returns the name and age of the person as a string
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
