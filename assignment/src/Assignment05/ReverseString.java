package assignment05.q1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String input;
        String reversedString = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        input = sc.nextLine();

        for(int i = input.length() - 1; i >= 0; i--){
            reversedString = reversedString + input.charAt(i);
        }
        System.out.println("Input: "+input);
        System.out.println("Reversed String: "+reversedString);
    }
}
