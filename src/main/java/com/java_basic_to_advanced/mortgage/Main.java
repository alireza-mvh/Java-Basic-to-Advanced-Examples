package main.java.com.java_basic_to_advanced.mortgage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        Double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate(Percent): ");
        Double interestRate = scanner.nextDouble();
        Double monthlyInterest = (interestRate / PERCENT / MONTHS_IN_YEAR );
        System.out.print("Period(Years): ");
        int years = scanner.nextInt();
        int numberOfMonths = years * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfMonths))
                / (Math.pow((1 + monthlyInterest ), numberOfMonths) - 1 );
        System.out.print("your Mortgage is "+ mortgage + "\n");
    }
}

