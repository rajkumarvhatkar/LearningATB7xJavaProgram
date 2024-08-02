package practice_14072024;

import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter number 2");
        int num2 = scn.nextInt();

        System.out.println(Math.max(num1, num2));
    }
}
