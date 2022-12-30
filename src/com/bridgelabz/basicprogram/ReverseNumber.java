package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value :");
        int num = scan.nextInt();
        int reverce = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverce = reverce * 10 + remainder;
            num = num / 10;
        }
        System.out.println("The reverse of "+num+" is = " + reverce);
    }
}
