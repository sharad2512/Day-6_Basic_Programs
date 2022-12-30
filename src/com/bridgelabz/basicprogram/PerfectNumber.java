package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {

            System.out.println(num + " Is Perfect Number");
        } else {
            System.out.println(num + " Is Not Perfect Number");
        }

    }
}
