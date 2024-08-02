package Hw_Assignment;

import java.util.Scanner;

public class Hw_Lab002 {
    public static void main(String[] args) {
//        Write a program that prints numbers from 1 to 100.
//    However, for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        Scanner scn = new Scanner(System.in);

       // System.out.println("Enter number between 1 to 100");
       // int num = scn.nextInt();
        for (int i = 1; i <= 100; i ++){
             if (i % 3 == 0 && i % 5 == 0) { // if there are multiple conditions get it on top
                System.out.println(i +" FizzBuzz");
            }
            else if ( i % 3 == 0 ){
                System.out.println(i +" Fizz");
            } else if (i % 5 == 0){
                System.out.println(i +" Buzz");
            }
//            else{
//                 System.out.println(i);
//             }
        }
    }
}
