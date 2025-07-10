package oopsconceptofjava;

 class Employee{
     private int id;

     private String name;

     private int age;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }


     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
public class GetterAndSetter {
    public static void main(String[] args) {
        System.out.println("ths is an Getter and setter class");

        Employee rav = new Employee();
        Employee sim= new Employee();

        rav.setId(12);
        rav.setAge(24);
        rav.setName("Ravneet");
           System.out.println(rav.getId());
           System.out.println(rav.getAge());
           System.out.println(rav.getName());

        sim.setId(13);
        sim.setAge(24);
        sim.setName("Simar");
            System.out.println(sim.getId());
            System.out.println(sim.getAge());
            System.out.println(sim.getName());


    }
}
