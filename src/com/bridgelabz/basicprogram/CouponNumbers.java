package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        int number = 0;
        int num1 = 0;
        int distinctnum = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for find coupon number");
        number = scan.nextInt();
        boolean[] coupon = new boolean[number];

        while (distinctnum < number) {
            num1 = (int) ((Math.random() * 100) % number);
            count++;
            if (coupon[num1] == false) {
                distinctnum++;
                coupon[num1] = true;
                System.out.println(num1);
            }

        }
        System.out.println("count of while loop executed is  " + count);
    }
}
