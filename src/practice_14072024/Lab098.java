package practice_14072024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter char: ");
        char ch = scn.next().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonent");
        }
    }
}
