package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class SqrtToSqureroot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Positive Int Value");
        double c = scan.nextInt();
        double epsilon = 1.0e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("Squre root of c is :-" + t);
    }
}
