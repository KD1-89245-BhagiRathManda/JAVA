package assignments.assignment10.q1;
/*
1. Calculate the factorial of the given number using stream operations.
2. Write a program to calculate sum of integers using streams.
3. Create an IntStream to represent numbers from 1 to 10.
   Call various functions like sum(), summaryStatistics() and observe the output
 */


import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    private static Scanner sc = new Scanner(System.in);

    public static int factorial(int n){
        return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
    }

    public static void acceptNumber(int[] number){
        System.out.println("enter the Number to calculate factorial: ");
        number[0] = sc.nextInt();
    }

    public static void main(String[] args) {
//        System.out.println("Enter the Number to calculate Factorial : ");
//        int n = sc.nextInt();
//        IntStream strm1 = IntStream.rangeClosed(1, n);
//        int res = strm1.reduce(1, (x, y)-> x * y);
//        System.out.println("Factorial of "+n+ " is " +res);
        int[] number = new int[1];
        acceptNumber(number);
        System.out.println("Factorial of "+number[0]+ " is " +factorial(number[0]));


    }
}
