package stringExample;

public class IntergerToStringConversion {
    public static void main(String[] args) {

        String strnum = "123";

        //convert String to Integer
        int number = Integer.parseInt(strnum);

        //convert integer to String
        String str = Integer.toString(number);

        System.out.println(" Input String : " + strnum);
        System.out.println(" Convert String into Integer : " +number);
        System.out.println(" Convert back Integer to String: "+ str);

    }
}
