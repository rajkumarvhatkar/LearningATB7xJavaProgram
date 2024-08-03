package practice_21072024;

public class SecongMaximumArry {
    public static void main(String[] args) {

        int[] arr = {1,222,70,4,9,6};

      //  int max = arr[0];
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
                
            }

        }
        System.out.println(secondMax);

//        int[] arr = {1,2,3,4,5,6};
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            System.out.println(arr[i]);
//        }
    }
}
