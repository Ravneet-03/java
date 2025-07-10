package InterviewJavaPractical;

import org.w3c.dom.ls.LSOutput;

public class ReverseJava {
    public static void main(String[] args) {


    String str= "Hello world";
    String rev = "";

    for ( int i = str.length()-1 ; i>=0 ; i--){

        rev+=str.charAt(i);
    }
        System.out.println(rev);
    }
}
