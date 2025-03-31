package assignment06.a;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value of X: ");
            double x = input.nextDouble();
            System.out.println("Enter value of Y: ");
            double y = input.nextDouble();
            Circle c1 = new Circle(x,y);
            System.out.println("Diameter is "+c1.calculatedDiameter());
        }catch (NegativeDiameterException e){
            System.out.println(e.getMessage());
        }


    }
}
