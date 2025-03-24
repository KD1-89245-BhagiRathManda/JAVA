// Accept 2 double values from User (using Scanner). Check data type. If 
// arguments are not doubles, supply suitable error message & terminate. 
// If numbers are double values, print its average.

package as1;
import java.util.*;

public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d1 = 0;
		double d2 = 0;

		if(sc.hasNextDouble()) {
			d1 = sc.nextDouble();
		}
		else {
			System.out.println("Please Enter Double Number....");
			System.exit(0);
		}
		if(sc.hasNextDouble()) {
			
		 d2 = sc.nextDouble();
		}
		else {
			System.out.println("Please Enter Double Number....");
			System.exit(0);
		}
		
		double avg = (d1+d2)/2;
		System.out.println("Average is: " + avg);
	}

}
