package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by Bikram on 2/26/2017.
 */
//public class Area {
//    public static void main(String[] args) {
//        double pi = 3.14;
//        System.out.println("Enter radius: ");
//        Scanner scanner = new Scanner(System.in);
//        double r = scanner.nextDouble();
//        if (r < 0) {
//            System.out.println("Please enter a positive number");
//        }else{
//            double area = pi * r * r;
//            System.out.println(area);
//        }
//    }
//}
public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double r = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = scanner.nextDouble();
        while (r > 0) {
            if (r < 0) {
                System.out.println("Enter positive number.");
            } else {
                double area = pi * r * r;
                System.out.println(area);
                System.out.println("Enter radius: ");
                r = scanner.nextDouble();
            }

        }
    }
}


