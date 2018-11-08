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
public class PriceComparator implements Comparator<Item> {

    /**
     * Override compare() method of the class PriceComparator compares two
     * Item.getPriceOfTheItem() values.
     *
     * @param o1 First item to be compared.
     * @param o2 Second item to be compared.
     * @return A negative integer, zero, or a positive integer as the first
     * argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getPriceOfTheItem().compareTo(o2.getPriceOfTheItem());
    }

}
