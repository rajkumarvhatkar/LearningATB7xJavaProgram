package Pre_Module_pr;

import java.util.Scanner;

public class Lab1019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 4 != 0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
