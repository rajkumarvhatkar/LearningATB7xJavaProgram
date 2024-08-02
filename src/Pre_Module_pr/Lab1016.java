package Pre_Module_pr;

import java.util.Scanner;

public class Lab1016 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = n-1; i >= 0 ; i = i-2) {
            System.out.print(arr[i]+" ");
        }
    }
}
