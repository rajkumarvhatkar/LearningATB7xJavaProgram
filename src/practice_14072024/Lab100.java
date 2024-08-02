package practice_14072024;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter gender m or f");
        char ch = scn.next().charAt(0);

        switch (ch){
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Gender not specified");
        }
    }
}
