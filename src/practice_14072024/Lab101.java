package practice_14072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //This Java code prompts the user to input a month number and
        // then uses a switch statement to determine the number of days in that month.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter month number between 1 to 12");
        int month = scn.nextInt();

        switch (month){
            case 1,3,5,7,9,11:
                System.out.println("In this months 31 days");
                break;
            case 4,6,8,10,12:
                System.out.println("In this month 30 days");
                break;
            case 2:
                System.out.println("In this month 28 or 29 days");
                break;
            default:
                System.out.println("Not a specified month");
        }
    }
}
