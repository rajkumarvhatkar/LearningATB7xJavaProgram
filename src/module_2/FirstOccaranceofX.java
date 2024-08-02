package module_2;

import java.util.Scanner;

public class FirstOccaranceofX {

    public static int firstOccurance(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) return i;
        }return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");

        int n = scn.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        System.out.println(firstOccurance(arr, target));
    }
}
