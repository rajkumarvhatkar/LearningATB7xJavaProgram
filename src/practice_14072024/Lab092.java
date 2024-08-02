package practice_14072024;

public class Lab092 {
    public static void main(String[] args) {
        int itemCode = 000;

        switch (itemCode){
            case 001, 002, 003:
                System.out.println("These are electronice gadgets");
                break;
            case 004, 005, 006:
                System.out.println("These are mechanical gadgets");
                break;
            default:
                System.out.println("none");
        }
    }
}
