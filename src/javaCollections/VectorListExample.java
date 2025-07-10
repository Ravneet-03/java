package javaCollections;

import java.util.Vector;

public class VectorListExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ravneet");
        vector.add("Simar");
        vector.add("Rohit");
        vector.add("Goutam");
        vector.add("Ashutosh");
        vector.add("Kshitiz");
        vector.add("Aditya");

        for( String names : vector){
            System.out.println(names);

        }

    }
}
