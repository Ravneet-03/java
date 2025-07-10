package oopsconceptofjava;

class Student{

     private int rollNumber;

    private  String name;

    private float grade;
// get  roll number
    public int getRollNumber() {
        return rollNumber;
    }
// set roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // get name
    public String getName() {
        return name;
    }
 // set name
    public void setName(String name) {
        this.name = name;
    }

    // get grade


    public float getGrade() {
        return grade;
    }
      // set grade
    public void setGrade(float grade) {
        if (grade>=0.0 && grade <=100.0 ){
            this.grade = grade;
        } else{
        this.grade =0.0f;
            System.out.println("invalid Grade please enter a valid grade 0.0 to 100.0 \n " + grade );
        }
    }

}


public class GetterAndSetterStudentGrade {
    public static void main(String[] args) {
        System.out.println("Your Grade of 10th class");

        Student rav= new Student();
        Student sim = new Student();

        rav.setName("Ravneet");
        rav.setRollNumber(2345678);
        rav.setGrade(97.12f);

          System.out.println(" \n your name is : "+rav.getName());
          System.out.println("your rollNumber is :" + rav.getRollNumber());
          System.out.println(" your grade is : " + rav.getGrade());

        sim.setName("Simar");
        sim.setRollNumber(2345681);
        sim.setGrade(120.4f);

        System.out.println("your name is:" + sim.getName());
        System.out.println(" your rollNumber is:" + sim.getRollNumber());
        System.out.println("your grade is :" + sim.getGrade());

    }
}

