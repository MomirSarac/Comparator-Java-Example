/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator.java.example;

import java.util.Comparator;

/**
 *
 * @author Momir Sarac
 */
public class NameComparator implements Comparator<Item> {

    /**
     * Override compare() method of the class NameComparator compares two
     * Item.getNameOfTheItem() values.
     *
     *
     * @param o1 First item to be compared.
     * @param o2 Second item to be compared.
     * @return a negative integer, zero, or a positive integer as the specified
     * o1.getNameOfTheItem() String is greater than, equal to, or less than
     * o2.getNameOfTheItem() String, ignoring case considerations.
     */
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getNameOfTheItem().compareToIgnoreCase(o2.getNameOfTheItem());
    }
}
