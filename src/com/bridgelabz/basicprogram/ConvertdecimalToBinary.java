package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class ConvertdecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number ");
        int num = scan.nextInt();
        int index = 0;
        int array[] = new int [10];
        while (num > 0){
            array[index] = num % 2;
             index ++;
             num = num / 2;
        }
        System.out.println("is Binary value is :-");
        for (int i = index -1; i >=0; i--){
            System.out.print(array[i]);
        }
    }
}
