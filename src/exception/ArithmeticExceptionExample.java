package exception;


       // you can handle the exception with try and catch block
public class ArithmeticExceptionExample {

    public static void main(String[] args) {


      try {
          System.out.println("Hello");
          System.out.println(40 / 0);
          System.out.println("Good Evening");    // this statement will not be executed
      }catch(Exception e ) {
          e.printStackTrace();
      }

    }
}
