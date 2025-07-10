package InterviewJavaPractical;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name to check Palindrome : ");
        String st = sc.next();

        String str = st.toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();


        if ( str.equals(rev)){
            System.out.println("your input is Palindrome");

        }else {
            System.out.println("your Input is not Palindrome");
        }

    }
}
