package exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
          String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException n){
            n.printStackTrace();

        }
    }
}
