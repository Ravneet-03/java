package javaCollections.SetExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set <String> Treeset = new TreeSet<>();
        Treeset.add("Apple");
        Treeset.add("Mango");
        Treeset.add("Cherry");
        Treeset.add("Banana");
        Treeset.add("Mango"); // ignores duplicate values
      //  Treeset.add(null);  // not Stored Null values

        System.out.println("Tree set follows Sorted order");

        for(String Fruits : Treeset){
            System.out.println( " values : " + Fruits);
        }
    }
}
