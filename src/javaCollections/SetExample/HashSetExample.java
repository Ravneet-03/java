package javaCollections.SetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set <String> hashset = new HashSet<>();

        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Mango");
        hashset.add("Cherry");
        hashset.add("Mango"); // ignores Duplicate values

        System.out.println(" Hash Set (No order follow ) ");

        for (String fruits : hashset) {
            System.out.println("values : "+ fruits);

        }
    }
}
