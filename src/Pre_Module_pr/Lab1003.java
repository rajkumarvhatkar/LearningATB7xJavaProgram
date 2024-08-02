package Pre_Module_pr;

import java.util.Scanner;

public class Lab1003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n = scn.nextInt();
        System.out.println("Enter number 2");
        int k = scn.nextInt();
        System.out.println("Enter number 3");
        int l = scn.nextInt();

        for (int i = n; i >= l; i = i - k) {
            System.out.println(i);
        }
    }
}
