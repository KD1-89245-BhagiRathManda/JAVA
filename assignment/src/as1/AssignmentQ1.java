package as1;
//1. Accept a integer number and when the program is executed print the 
//binary, octal and hexadecimal equivalent of the given number. 
//Sample Output: 
//java Test 
//Enter Number : 20 
//Given Number :20 
//Binary equivalent :10100 
//Octal equivalent :24 
//Hexadecimal equivalent :14 
//toBinaryString() , toOctalString(), toHexString() 

import java.util.*;

public class AssignmentQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number which you want to Convert :- ");
		int n = sc.nextInt();
		System.out.println("Binary equivalent: "+Integer.toBinaryString(n));
		System.out.println("Octal equivalent: "+Integer.toOctalString(n));
		System.out.println("HexaDecimal equivalent: "+Integer.toHexString(n));
	}
}
