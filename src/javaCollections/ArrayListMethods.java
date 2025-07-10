package javaCollections;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList <String> List = new ArrayList<>();
        List.add("Apple");
        List.add("Banana");
        List.add("Watermelon");


        System.out.println( "original list : " +List); //printing the original list
        System.out.println("getting element of 2 index :" + List.get(2)); // getting the element of 2 index
        List.add(1 , "Orange");  // adding orange at 1 index
        System.out.println( "Set :  " + List.set(0,"mango")); // setting the element
        System.out.println("remvove : " + List.remove(1)); // removing

        // getting the 2nd index of list  after updating
        System.out.println("getting element of 2 index after updating list :" + List.get(2));

        System.out.println("Size of elements : " + List.size()); // size of list

        System.out.println("contains : " + List.contains("mango"));
        System.out.println("Empty :" + List.isEmpty());
        List.clear();
        for ( String fruits : List) {
            System.out.println("update list : " + fruits);

        }





    }
}
