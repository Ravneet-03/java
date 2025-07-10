package oopsconceptofjava;

public class MethodOverriding extends ParentOverriding {

    public void tataCars(){
        System.out.println("TATA: Everything we do is Driven  by you ");
    }

    public static void main(String[] args) {

        MethodOverriding or = new MethodOverriding();
        MethodOverriding cr = new MethodOverriding();
        or.tataCars();
        cr.tata();

    }


}
