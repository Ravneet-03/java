package oopsconceptofjava.casting;

public class UpCastingAndDowncasting extends Example {
    int x= 800;
    public void bmw(){
        System.out.println("BMW: Speed and Precision in Every Decision");
    }
    public void Jaguar(){
        System.out.println("Jaguar: Excellence in Motion , Driven by Devotion ");
    }
    public static void main(String[] args) {
       /* UpCasting up= new UpCasting();
        System.out.println(up.x);
        up.bmw(); */
        //Upcasting
        Example e= new UpCastingAndDowncasting();
        System.out.println(e.x);
        e.bmw();
       // e.jaguar();

        //Downcasting
         UpCastingAndDowncasting up = (UpCastingAndDowncasting)e;
         up.Jaguar();





    }

}

