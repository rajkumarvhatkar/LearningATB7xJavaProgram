package practice_14072024;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter number 2");
        int num2 = scn.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
}
