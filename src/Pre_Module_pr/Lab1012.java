package Pre_Module_pr;

import java.util.Scanner;

public class Lab1012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n for string length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
           if (i % 2 == 0) {
               System.out.println(arr[i]);
           }
        }

    }
}
