package Pre_Module_pr;

import java.util.Scanner;

public class Lab1014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size number: ");
        int N = scn.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < N; i ++) {
            if (i % 3 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
