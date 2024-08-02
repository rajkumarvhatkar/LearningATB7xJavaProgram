package Pre_Module_pr;

import java.util.Scanner;

public class Lab1008 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n number:");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            String str = scn.nextLine();
            System.out.println(str);
        }


    }
}
