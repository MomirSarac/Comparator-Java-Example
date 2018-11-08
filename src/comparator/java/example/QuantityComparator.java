/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator.java.example;

import java.util.Comparator;

/**
 *
 * @author ubuntu-2018
 */
public class QuantityComparator implements Comparator<Item> {

    /**
     * Override compare() method of the class QuantityComparator compares two
     * Item.getQuantityOfTheItem() values.
     *
     * The operators ==, <, > and so on can only be used on primitive data types
     * like int, long, double or their wrapper classes like Integer and Double.
     *
     * @param o1 First item to be compared.
     * @param o2 Second item to be compared.
     * @return -1 if o1.getQuantityOfTheItem should be before
     * o2.getQuantityOfTheItem, 1 if o2.getQuantityOfTheItem should be before
     * o1.getQuantityOfTheItem or 0 otherwise
     */
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getQuantityOfTheItem() < o2.getQuantityOfTheItem() ? -1 : o1.getQuantityOfTheItem() == o2.getQuantityOfTheItem() ? 0 : 1;
    }
}
