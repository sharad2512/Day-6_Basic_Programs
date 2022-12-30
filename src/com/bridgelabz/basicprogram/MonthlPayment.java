package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class MonthlPayment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number of P,Y and R respectively");
        double P = scan.nextDouble();
        double Y = scan.nextDouble();
        double R = scan.nextDouble();
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P*r)/(1-Math.pow((1+r), (-n)));
        System.out.println("Monthly Payment is - "+payment);
    }
}
