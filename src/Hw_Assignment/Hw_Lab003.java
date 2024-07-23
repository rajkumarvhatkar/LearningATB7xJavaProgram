package Hw_Assignment;

import java.util.Scanner;

public class Hw_Lab003 {
    public static void main(String[] args) {
//        ✅ Leap Year Checker:
//        Create a program that determines whether a given year is a leap year.
//        A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
//        Use an if-else statement to make this determination.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scn.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
