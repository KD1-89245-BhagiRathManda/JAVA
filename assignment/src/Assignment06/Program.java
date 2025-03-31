package assignment06.q1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        try{
            checkString(string);
            System.out.println("String length is acceptable: "+string.length());
        }catch(ExceptionLineTooLong e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String string) throws ExceptionLineTooLong{
        if(string.length() > 80){
            throw new ExceptionLineTooLong();
        }
    }
}
