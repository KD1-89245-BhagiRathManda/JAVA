//2.Create a class called Employee that includes three instance variables—a 
//first name (type String), a last name (type String) and a monthly salary 
//(double). Provide a constructor that initializes the three instance variables. 
//Provide a set and a get method for each instance variable. If the monthly 
//salary is not positive, do not set its value. Write a test application named 
//EmployeeTest that demonstrates class Employee’s capabilities. Create two 
//Employee objects and display each object’s yearly salary. Then give each 
//Employee a 10% raise and display each Employee’s yearly salary again


package asignment2;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double yearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.monthlySalary *= (1 + percentage / 100.0);
        }
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Thakut", "Abhi", 20000.0);
        Employee e2 = new Employee("Aman", "Kumbhalkar", 90000.0);
        Employee e3 = new Employee("Bhagirath", "Manda", 200000.0);
        System.out.println("Abhi Yearly Salary: " + e1.yearlySalary());
        System.out.println("Aman Yearly Salary: " + e2.yearlySalary());
        System.out.println("Bhagitath Yearly Salary: " + e3.yearlySalary());
        e1.giveRaise(10);
        e2.giveRaise(10);
        e3.giveRaise(10);
        System.out.println("Let's give 10% Raise:");
        System.out.println("Abhi Yearly Salary: " + e1.yearlySalary());
        System.out.println("Aman Yearly Salary: " + e2.yearlySalary());
        System.out.println("Bhagitath Yearly Salary: " + e3.yearlySalary());
    }
}
