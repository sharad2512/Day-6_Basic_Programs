package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plz enter value : ");
        int value = scan.nextInt();
        int temp = 0;
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                temp = temp + 1;
                break;
            }
        }
        if (temp > 0) {
            System.out.println(value+" This is not prime number");
      } else {
            System.out.println(value+" This is prime number");
        }
    }
}
