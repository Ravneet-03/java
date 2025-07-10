package javaCollections.SetExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set <String> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Banana");
        LinkedHashSet.add("Cherry");
        LinkedHashSet.add("Apple"); // ignores Duplicate values..

        System.out.println("LinkedHashSet follows Insertion order"); // follows Insertion Orderc

        for (String fruits : LinkedHashSet){
            System.out.println("values : " + fruits);

        }
    }
}
