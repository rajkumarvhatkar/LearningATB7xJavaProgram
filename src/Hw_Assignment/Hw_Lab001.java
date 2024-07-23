package Hw_Assignment;

import java.util.Scanner;

public class Hw_Lab001 {
    public static void main(String[] args) {

        // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Length of 1st side");
        int a = scn.nextInt();
        System.out.println("Enter length of 2nd side");
        int b = scn.nextInt();
        System.out.println("Enter length of 3rd side");
        int c = scn.nextInt();

        if (a == b && b == c){
            System.out.println("Equilateral Trangle");
        }else if (a == b || b == c  || c == a){
            System.out.println("Isosceles Trangle");
        }else {
            System.out.println("Scalene Trangle");
        }



    }
}
