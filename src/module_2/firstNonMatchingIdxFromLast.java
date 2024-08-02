package module_2;

import java.util.Scanner;

public class firstNonMatchingIdxFromLast {

    public static int firstNonMatching(int[] arr1, int[] arr2){
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] != arr2[1]){
                return i;
            }
        } return  -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scn.nextInt();
        }
        System.out.println(firstNonMatching(arr1,arr2));
    }
}
