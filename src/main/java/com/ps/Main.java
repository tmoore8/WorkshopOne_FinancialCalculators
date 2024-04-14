package com.ps;

import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //prompts user to input which calculator they want
        System.out.println("Which Calculator would you like?");
        //receives input
        System.out.println("(M)ortgage, (F)uture Value, or (P)resent Value?");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("m")) {
            mortgageCalc();
        }
        else if (response.equalsIgnoreCase("f")){
            futureCalc();
        }
        else if (response.equalsIgnoreCase("p")){

        }
    }
    //first static method (mortgage calculator)
    public static double mortgageCalc(){
        System.out.println("Enter Principal");
        double principal = scanner.nextFloat();
        System.out.println("Enter Interest Rate");
        double iRate = scanner.nextFloat();
        System.out.println("Enter Length");
        int length = scanner.nextInt();

        double monthlyiRate = iRate / 100 / 12;
        int lengthMonths = length * 12;
        double monthlyPayment = (principal * monthlyiRate) / (1 - Math.pow(1+ monthlyiRate, - lengthMonths));
        double totalPayment = monthlyPayment * lengthMonths;
        double interestPaid = totalPayment - principal;
        System.out.println("Your expected monthly payment is: " + String.format("%.2f",monthlyPayment));
        System.out.println("Your total interest paid is: " + String.format("%.2f",interestPaid));
        return monthlyPayment;
    }
    //second static method (future value)
    public static double futureCalc(){
            System.out.println("Enter Deposit");
            double deposit = scanner.nextFloat();
            System.out.println("Enter Interest Rate");
            double iRate = scanner.nextFloat();
            System.out.println("Enter Length");
            int length = scanner.nextInt();

            double dailyiRate = iRate / 100 / 365;
            int lengthDays = length * 365;
            int compoundPeriod = 365 * length;
            double futureValue = deposit * Math.pow(1+ dailyiRate, lengthDays);
            double interestEarned = futureValue - deposit;
            System.out.println("Your expected future value is: " + String.format("%.2f", futureValue));
            System.out.println("Your total interest earned is: " + String.format("%.2f", interestEarned));
        return futureValue;
    }
}

