package Pre_Module_pr;

import java.util.Scanner;

public class Lab1002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter njumber 1");

        int n = scn.nextInt();
        System.out.println("Enter number 2");

        int k = scn.nextInt();

        for (int i = n; i >= 0 ; i = i - k) {
            System.out.println(i);
        }
    }
}
