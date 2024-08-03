package practice_21072024;

public class SecondMinArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int min = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            } else if (arr[i] < SecondMin && arr[i] != min)
             {
                 SecondMin = arr[i];
            }
        }
        System.out.println(SecondMin);
    }
}
