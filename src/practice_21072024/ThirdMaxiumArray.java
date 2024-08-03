package practice_21072024;

public class ThirdMaxiumArray {
    public static void main(String[] args) {

        int[] arr = {1,222,70,4,9,6};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            } else if ( arr[i] > thirdMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println(thirdMax);
    }
}
