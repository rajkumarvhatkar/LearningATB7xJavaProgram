package practice_14072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        System.out.println("Enter browser name which you want to use:");
        String Browser_Name = scn.nextLine();
        Browser_Name = Browser_Name.toLowerCase();

        switch (Browser_Name){
            case "chrome":
                System.out.println("Starting chrome");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
            case "safari":
                System.out.println("Starting safari");
                break;
            default:
                System.out.println("I have no idea which browser is this");

        }
    }
}
