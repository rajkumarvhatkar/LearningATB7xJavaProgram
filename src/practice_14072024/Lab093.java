package practice_14072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter char:");
        char ch = scn.next().charAt(0);

        switch (ch){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not vowel this is consonent");
        }
    }
}
