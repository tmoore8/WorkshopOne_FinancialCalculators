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
    }
    public static double mortgageCalc(){
        System.out.println("Enter Principal");
        double principal = scanner.nextFloat();
        System.out.println("Enter Interest Rate");
        double iRate = scanner.nextFloat();
        System.out.println("Enter Length");
        int length = scanner.nextInt();
        return 0;
    }

}

