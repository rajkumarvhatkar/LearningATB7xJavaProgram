package practice_14072024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scn.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scn.nextInt();

        System.out.println("Entwer num3: ");
        int num3 = scn.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println("num2");
        }else {
            System.out.println(num3);
        }
    }
}
