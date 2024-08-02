package Pre_Module_pr;

import java.util.Scanner;

public class Lab1005 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input no n:");
        int n = scn.nextInt();


        for (int i = 0; i < n; i ++){
           // System.out.println("Enter number");
            int num = scn.nextInt();

            if (i % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }
    }
}
