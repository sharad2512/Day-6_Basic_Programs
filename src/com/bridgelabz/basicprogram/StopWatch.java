package com.bridgelabz.basicprogram;
import java.util.*;
public class StopWatch {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("PRESS 1 to the start stop watch");
            double startTime = sc.nextDouble();
            startTime = System.currentTimeMillis();

            System.out.println("PRESS 2 to stop the stop watch");
            double endTime = sc.nextDouble();
            endTime = System.currentTimeMillis();

            System.out.println("The Elapsed time is  " + ((endTime - startTime) / 1000) + " seconds ");

        }
}
