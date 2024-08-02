package Pre_Module_pr;

import java.util.Scanner;

public class Lab1006 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
//        String name = "Rajkumar";
//        System.out.println(name.length());
        String ch = scn.nextLine();
        for (int i = 0; i < ch.length(); i++) {
            if (i % 2 == 0) {
                char cha = ch.charAt(i);
                System.out.print(cha);
            }


        }
    }
}
