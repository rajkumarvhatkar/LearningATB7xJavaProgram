package practice_14072024;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scn.nextInt();

        if (num > 0 ){
            System.out.println("Positive number");
        }else if (num < 0){
            System.out.println("Negative number");
        }else {
            System.out.println("zero");
        }

    }
}
