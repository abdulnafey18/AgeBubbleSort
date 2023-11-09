/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agebubblesort;

import java.util.ArrayList;

/**
 *
 * @author abdul.nafey18
 * @param <ElementType>
 */
public class MyArrayList<ElementType extends Comparable<ElementType>> extends ArrayList<ElementType> {

    // Counter variable which keeps track of the number of comparisons made during the sorting process
    private int comparisons = 0;

    // Bubble sort algorithm which sorts elements in the ArrayList in descending order
    public void bubbleSort() {
        int iCount, jCount;
        ElementType elementAtjCount, elementAtjCountPlus;
        for (iCount = 0; iCount < size(); iCount++) {
            for (jCount = 0; jCount < size() - 1 - iCount; jCount++) {
                elementAtjCount = get(jCount);
                elementAtjCountPlus = get(jCount + 1);
                if (elementAtjCount.compareTo(elementAtjCountPlus) > 0) {
                    // Swaping the element on position jCount with element on the position jCount + 1
                    swap(jCount, jCount + 1);
                }
                // Incrementing the number of comparisons that are being made
                comparisons++;
            }
        }
    }

    public void swap(int inPos1, int inPos2) {
        // Creating two objects that will store the information from the two positions
        ElementType objPos1 = get(inPos1);
        ElementType objPos2 = get(inPos2);

        // Removing element from position 1
        remove(inPos1);

        // Inserting objPos2 into position 1
        add(inPos1, objPos2);

        // Removing element from position 2
        remove(inPos2);

        // Inserting objPos1 into position 2
        add(inPos2, objPos1);
    }

    // Retriving the number of comparisons made during the sorting process in the form of a variable
    public int getComparisons() {
        return comparisons;
    }

}
