package Pre_Module_pr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab1018 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
