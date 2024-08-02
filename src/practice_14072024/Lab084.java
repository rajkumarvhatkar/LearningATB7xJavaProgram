package practice_14072024;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Nmuber");
        int num = scn.nextInt();

        if (num % 2 == 0){
            System.out.println("even " + num);
        }else {
            System.out.println("odd " + num);
        }
    }
}
