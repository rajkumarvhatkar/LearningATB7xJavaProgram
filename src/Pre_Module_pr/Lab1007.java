package Pre_Module_pr;

public class Lab1007 {
    public static void main(String[] args) {
//        for (int i = 26; i >= 0; i --){
//            char ch = (char)(i + 'a');
//            System.out.println(ch);
//        }

        for (char ch = 'z'; ch >= 'a'; ch --){
            if (ch % 2 == 0) {
                System.out.println(ch);
            }
        }
    }
}
