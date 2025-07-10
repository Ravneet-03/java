package stringExample;

import java.util.Scanner;

public class CheckingVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to Check \"Vowels\" and \"Constant\" : ");

        String s = scanner.nextLine();

        String Lowers = s.toLowerCase();

        int vowels = 0;
        int constant = 0;
        for (int i = 0; i < Lowers.length(); i++) {
            char ch = Lowers.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;

            } else {
                constant++;
            }


        }
        System.out.println(" VOWELS " + vowels + "\n CONSTANT : " + constant);
    }
}