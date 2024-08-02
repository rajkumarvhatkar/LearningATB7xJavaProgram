package Pre_Module_pr;

import java.util.Scanner;

public class Lab1013 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n number is the size of arr: ");
        int N = scn.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = N - 1; i>=0; i --){
            System.out.print((arr[i])+ " ");
        }

    }
}
