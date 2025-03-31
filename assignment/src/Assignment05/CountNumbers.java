package assignment05.q3;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String inputString = scanner.nextLine().trim();
        String[] words = inputString.split(" ");
        for(String word : words) {
            length+= word.length();
        }

        System.out.printf("The length of the String is %d : ", length);

    }
}
