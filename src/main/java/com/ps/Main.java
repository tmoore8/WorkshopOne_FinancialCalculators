package com.ps;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //prompts user to input which calculator they want
        System.out.println("Which Calculator would you like?");
        //receives input
        Scanner whichCalc = new Scanner(System.in);
        System.out.println("Mortgage, Future Value, or Present Value?");
        String response = whichCalc.nextLine();

    }

}