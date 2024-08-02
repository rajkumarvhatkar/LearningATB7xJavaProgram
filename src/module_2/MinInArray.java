package module_2;

import java.util.Scanner;

public class MinInArray {

    public static  int minOfArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        } return min;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(minOfArray(arr));
    }
}
