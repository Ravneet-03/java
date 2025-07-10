package oopsconceptofjava;

 class employee{
     int id;
     String name;
     public void printDetails(){
         System.out.println("your Id is " + id);
         System.out.println("your Name is " + name);
     }
 }


public class AbstractEmployee {

    public static void main(String[] args) {
        System.out.println("This is our Custom class...!");

        employee ravneet = new employee();
        employee simar = new employee();

        ravneet.id = 10;
        ravneet.name = "Ravneet";

        simar.id = 11;
        simar.name = "Simar";
        //System.out.println(ravneet.id);
        //System.out.println(ravneet.name);

        ravneet.printDetails();
        simar.printDetails();
    }
}
