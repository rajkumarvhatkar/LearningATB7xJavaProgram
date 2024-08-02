package module_2;

import java.util.Scanner;

public class LastOccurance {

    public static int lastOccurance(int[] arr,int target){
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }return answer;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(lastOccurance(arr,target));
    }
}
