package client;

import java.util.Scanner;

import account.Account;
import factory.InterestRate;
import loan.Loan;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the Banking System");
        System.out.println("Enter the type of Customer you want to be:");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        int choice = scn.nextInt();
        Client client = new Client(choice);
        if (client.getInterestRate() == null) {
            System.out.println("Invalid Choice");
            System.exit(0);
        }

        InterestRate interestRate = client.getInterestRate();

        System.out.println("Enter the principal amount:");
        double principal = scn.nextDouble();
        System.out.println("Enter the number of years:");
        int years = scn.nextInt();
        System.out.println("Enter the type of Service you want:");
        System.out.println("1. Account");
        System.out.println("2. Loan");
        int service = scn.nextInt();

        Account account;
        Loan loan;

        if (service == 1) {
            System.out.println("Your Service has been created");
            account = interestRate.createAccount(principal);
            System.out.println("The total interest for " + years + " years is: " + account.getTotalInterest(years));
        } else if (service == 2) {
            System.out.println("Your Service has been created");
            loan = interestRate.createLoan(principal);
            System.out.println("The total interest for " + years + " years over your loan is: "
                    + loan.getTotalInterest(years));
        } else {
            System.out.println("Invalid Choice");
        }
        scn.close();
    }
}
