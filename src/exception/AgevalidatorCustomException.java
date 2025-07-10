package exception;

import java.util.Scanner;

public class AgevalidatorCustomException  {
    public static void checkAge (int age) throws NegavtiveCustomException, UnderAgeCustomException {

     if (age< 0){
         throw new NegavtiveCustomException(" Error : Age cannot be Negative..!");
     }else if (age <18  ) {
         throw new UnderAgeCustomException(" Error : You must be at least 18 years Old..!");
     }else{
         System.out.println("Access Granted..!");
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your age: " );


        try{ int age = scanner.nextInt();
                 checkAge(age);
        }catch(NegavtiveCustomException n){
            n.printStackTrace();
        }catch(UnderAgeCustomException u){
            u.printStackTrace();
        }catch( Exception e){
            e.printStackTrace();
        }



    }
}
