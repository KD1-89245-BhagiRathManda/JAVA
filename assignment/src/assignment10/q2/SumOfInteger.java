package assignments.assignment10.q2;

import java.util.Scanner;
import java.util.stream.IntStream;

//2. Write a program to calculate sum of integers using streams.
public class SumOfInteger{
    private static Scanner sc = new Scanner(System.in);

    public static void acceptInteger(int[] num){
        System.out.println("Enter the Integer to calculate sum: ");
        num[0] = sc.nextInt();
    }

    public static int sumOfInteger(int num){
        return IntStream.rangeClosed(1, num).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int[] num = new int[1];
        acceptInteger(num);
        System.out.println(sumOfInteger(num[0]));

    }
}
