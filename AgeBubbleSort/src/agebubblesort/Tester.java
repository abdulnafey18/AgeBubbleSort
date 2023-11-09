/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agebubblesort;

/**
 *
 * @author abdul.nafey18
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Three different array sizes to sort
        int[] arraySizes = {3, 2, 1};
        // Sort each array size
        for (int i = 0; i < arraySizes.length; i++) {
            int arraySize = arraySizes[i];
            System.out.println("******************");
            System.out.println("Sorting array of size: " + arraySize);
            // Creating a ArrayList of Person objects
            MyArrayList<Person> people;
            people = new MyArrayList<>();
            // Adding Persons with different ages to the MyArrayList
            for (int iCount = 0; iCount < arraySize; iCount++) {
                people.add(new Person("Alice", 5));
                people.add(new Person("Bob", 3));
                people.add(new Person("Charlie", 15));
                people.add(new Person("David", 33));
                people.add(new Person("Emily", 27));
                people.add(new Person("Frank", 25));
                people.add(new Person("Grace", 50));
                people.add(new Person("Henry", 69));
                people.add(new Person("Isabel", 84));
                people.add(new Person("Jack", 100));
            }
            System.out.println("Initially the persons in the shuffled list are: " + people.toString());

            // Sorting the MyArrayList using the bubble sort algorithm
            people.bubbleSort();

            System.out.println("The persons after the Bubble Sort and their age in descending order are: " + people.toString());

            // printing the number of comparisons made by the algorithm
            System.out.println("Total number of comparisons in this size of collection is: " + people.getComparisons());
        }
    }
}
