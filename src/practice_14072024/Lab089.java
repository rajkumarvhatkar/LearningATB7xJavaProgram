package practice_14072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7: ");
        int day = scn.nextInt();

        switch (day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("tue");
                break;
            case 3 :
                System.out.println("wed");
                break;
            case 4 :
                System.out.println("thru");
                break;
            case 5 :
                System.out.println("fri");
                break;
            case 6 :
                System.out.println("sat");
                break;
            case 7 :
                System.out.println("sun");
                break;
            default:
                System.out.println("No idea what day is it");
        }
    }
}
