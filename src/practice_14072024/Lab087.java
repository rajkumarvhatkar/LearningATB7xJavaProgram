package practice_14072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int score = scn.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79 ) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
