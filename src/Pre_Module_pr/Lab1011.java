package Pre_Module_pr;

import java.util.Scanner;

public class Lab1011 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] runs = new int[5];
             System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            runs[i] = scn.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(runs[i] + " ");
        }


    }
}
