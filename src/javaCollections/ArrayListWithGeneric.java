package javaCollections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListWithGeneric {
    public static void main(String[] args) {
        ArrayList<String> Cities = new ArrayList<>();
        Cities.add("Amritsar");
        Cities.add("Patiala");
        Cities.add("Jalandhar");
        Cities.add("Jalandhar");
        Cities.add("Ludhiana");
        Cities.add("Dehardun");
        Cities.add("Haridwar");
        Cities.add("Rishikesh");

        /*// Ascending order
        Collections.sort(Cities);
        for ( String city : Cities){
            System.out.println( "Ascending order : " +  city);
        }*/
        // Descending Order

//        Collections.sort(Cities,Collections.reverseOrder());
//         for( String dsc : Cities) {
//             System.out.println( " Descending Order  :  " + dsc);
//         }

        // original Values
        System.out.println("Original Values : " + Cities);
        // Minimum vlaue
        System.out.println("Min Value : " + Collections.min(Cities));
        // Maximum value
        System.out.println("Max value : " + Collections.max(Cities));
        // Reverse value
        Collections.reverse(Cities);
        System.out.println(" Reverse Value : " + Cities);
        // Shuffle value
        Collections.shuffle(Cities);
        System.out.println(" Shuffling values : " + Cities);
        // Frequency of Elemnets
        System.out.println(" Frequency OF Jalandhar : " + Collections.frequency(Cities,"Jalandhar"));

    }

}

