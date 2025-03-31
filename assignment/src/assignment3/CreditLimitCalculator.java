/*
(Credit Limit Calculator)
Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a
charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this
month
e) allowed credit limit.
The program should input all these facts as integers, calculate
the new balance (= beginning balance+ charges – credits),
display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose
credit limit is exceeded, the program should display
the message "Credit limit exceeded".
 */

//package assignment03.q2;
package assignment03.q2;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long accountNumber;
        long balanceAtBeginningOfTheMonth;
        long totalOfAllItemsCharged;
        int totalCredits;
        int allowedCreditLimit;

        System.out.println("Enter account number");
        accountNumber = scanner.nextLong();
        System.out.println("Enter balance at beginning of the month");
        balanceAtBeginningOfTheMonth = scanner.nextLong();
        System.out.println(" total of all items charged by the customer this month");
        totalOfAllItemsCharged = scanner.nextLong();
        System.out.println("total of all credits applied to the customer’s account this " +
                "month");
        totalCredits = scanner.nextInt();
        System.out.println("allowed credit limit.");
        allowedCreditLimit = scanner.nextInt();
        long newBalance = balanceAtBeginningOfTheMonth + totalOfAllItemsCharged - totalCredits;
        System.out.println("New balance: " + newBalance);
        if(newBalance > allowedCreditLimit) {
            System.out.println("Credit limit exceeded");
        }else{
            System.out.println("Credit limit does not exceeded");
        }

    }
}
