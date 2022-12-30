package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Binary number eg.(101011) :-");
        int binaryVal = scan.nextInt();
        int decimal = 0;
        int i = 0;
        while (binaryVal > 0){
           int rem = binaryVal % 10;
            decimal = (int) (decimal + rem * Math.pow(2, i));
            i++;
            binaryVal = binaryVal / 10;
        }
        System.out.println("Binary Value To decimal "+decimal);
    }
}
