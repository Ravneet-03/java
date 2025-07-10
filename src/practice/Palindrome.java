package practice;

public class Palindrome {
    public static void main(String[] args) {

        String sc = "ravneet";
        String Lower = sc.toLowerCase();
        String rev = new StringBuilder(Lower).reverse().toString();

        if (Lower.equals(rev)){
            System.out.println("it is palindrome :" + sc );
        }else {
            System.out.println("It is not palindrome :" + sc);
        }
    }
}
