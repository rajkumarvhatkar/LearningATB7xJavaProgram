package Pre_Module_pr;

import java.util.Scanner;

public class Lab1001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = scn.nextInt();

        for (int i = n; i > 0; i = i - 3){
            System.out.println(i);
        }
    }
}
