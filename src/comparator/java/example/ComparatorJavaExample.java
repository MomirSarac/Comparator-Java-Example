/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator.java.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Momir Sarac
 */
public class ComparatorJavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Item> list = listOfItems();
        System.out.println("Before sorting ...");
        for (Item i : list) {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        }

        // sorting with price comparator
        list.sort(new PriceComparator());

        System.out.println("After sorting with price comparator...");
        for (Item i : list) {
            System.out.print(String.format("%.2f", i.getPriceOfTheItem()) + "\n");
        }

        // sorting with name comparator
        list.sort(new NameComparator());

        System.out.println("After sorting with name comparator...");
        for (Item i : list) {
            System.out.print(i.getNameOfTheItem() + "\n");
        }

        // sorting with quantity comparator
        list.sort(new QuantityComparator());

        System.out.println("After sorting with quantity comparator...");
        for (Item i : list) {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        }
    }

    private static List<Item> listOfItems() {

        // typesafe generic declaration
        List<Item> list = new ArrayList<Item>();

        list.add(new Item("USB stick", new BigDecimal(19.99), 35));
        list.add(new Item("Laptop", new BigDecimal(599.99), 2));
        list.add(new Item("Snacks", new BigDecimal(0.99), 289));
        list.add(new Item("TV screen", new BigDecimal(189.99), 5));
        return list;
    }

}
