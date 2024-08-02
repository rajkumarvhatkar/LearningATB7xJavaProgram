package Pre_Module_pr;

import java.util.Scanner;

public class Lab1015 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size number:");
        int N = scn.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 1; i < N; i=i+2) {
                System.out.print(arr[i]+" ");

        }
    }
}
