package stringExample;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name to check palindrome : ");

        String a = scanner.nextLine();
        String b = new StringBuilder(a).reverse().toString();

        if (a.equals(b)) {
            System.out.println(a + " is a Palindrome");

        } else {
            System.out.println(a + " is not a Palindrome");
        }
    }

    }



