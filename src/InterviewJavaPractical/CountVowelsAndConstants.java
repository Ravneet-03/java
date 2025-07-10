package InterviewJavaPractical;

import java.util.Scanner;

public class CountVowelsAndConstants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to check Vowels and Constants :");
        String scr = sc.next();

        String lower = scr.toLowerCase();
        int vowels = 0;
        int constants = 0;

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;

            } else {
                constants++;
            }
        }
            System.out.println("vowels :" + vowels + " & " + "constants :" + constants);
    }
}
