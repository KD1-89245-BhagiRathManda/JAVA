//Display food menu to user. User will select items from menu along with the 
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
//prices to food items(hard code the prices)  When user enters 'Generate Bill' 
//option , display total bill & exit.
package as1;
import java.util.*;

public class AssignmentQ3 {
	
public static int menu() {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("What do you want to eat...");
		System.out.println("0. Exit");
		System.out.println("1. Do you need Dosa...");
		System.out.println("2. Do you need Samosa...");
		System.out.println("3. Do you need Idli...");
		System.out.println("4. Than ok do ...");
		System.out.println("*****************************************");
		choice = sc.nextInt();
		return choice;
	}

public static double generateBill(int dosa, int samosa, int Idali) {
	double totalbill = 0;
	totalbill = ((dosa*30)+(samosa*10)+(Idali*18));
	return totalbill;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dosa = 0;
		int samosa = 0;
		int Idali = 0;
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Good Choice How much do you want...");
				dosa = sc.nextInt();
				
				break;
				
			case 2:
				System.out.println("Good Choice How much do you want...");
				samosa = sc.nextInt();
				break;
				
			case 3:
				System.out.println("Good Choice How much do you want...");
				Idali = sc.nextInt();
				break;
			
			case 4:
				System.out.println(generateBill(dosa, samosa, Idali));
			default:
				break;
			}
		}
	}
	
	
}
