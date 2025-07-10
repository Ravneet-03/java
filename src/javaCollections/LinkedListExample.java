package javaCollections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList <String> Cities = new LinkedList<>();
        Cities.add("Amritsar");
        Cities.add("Patiala");
        Cities.add("Jalandhar");
        Cities.add("Ludhiana");
        Cities.add("Dehardun");
        Cities.add("Haridwar");
        Cities.add("Rishikesh");

        for (String City : Cities) {
            System.out.println(City);

        }
    }
}
