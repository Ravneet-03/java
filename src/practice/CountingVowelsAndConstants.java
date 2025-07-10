package practice;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountingVowelsAndConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to check vowels and constants : ");
        String  name  = sc.next();
        String lower = name.toLowerCase();

        int vowels = 0;
        int constants = 0;

        for (int i = 0; i <  lower.length(); i++){
            char ch = lower.charAt(i);

            if (ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
                vowels++;
            }else {
                constants++;
            }
        }
            System.out.println("vowels :" + vowels + " & " + "constants : " + constants);

    }
}
