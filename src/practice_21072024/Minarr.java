package practice_21072024;

public class Minarr {
    public static void main(String[] args) {

        int[] arr = {10,2,70,10,9,6};

       // int min = Integer.MAX_VALUE;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
