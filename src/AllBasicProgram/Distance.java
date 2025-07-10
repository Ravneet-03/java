package AllBasicProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter velocity number :");
        double velocity = scanner.nextDouble();
        System.out.print("Enter time : ");
        double time = scanner.nextDouble();
        System.out.print("enter acceleration :");
        double acceleration = scanner.nextDouble();

    double distance = (velocity * time)
                + (0.5 * acceleration * Math.pow(time,2));

        System.out.println(" your distance : "+distance);



    }



}
