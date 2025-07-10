package stringExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {

        String a= "Listen";
        String b="Silent";

        a = a.toLowerCase();
        b= b.toLowerCase();

        char[] arr1 = a.toCharArray();
        char[] arr2= b.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("This string is an Anagram String..!" );

        }else {
            System.out.println("This is not an Anagram String..!");
        }

    }
}
