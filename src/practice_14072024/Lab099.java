package practice_14072024;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scn.nextInt();

        switch (num % 2 ){
            case 0:
                System.out.println("This is even number");
                break;
            case 1:
                System.out.println("This is odd number");
        }


    }
}
