package Pre_Module_pr;

public class Lab_abcd {
    public static void main(String[] args) {
        //using integer
//        for (int i = 0; i < 26; i ++) {
//                System.out.println((char) (i + 'a'));
//
//
//        }
//        for (int a = 0; a < 26; a ++){
//            System.out.println((char)(a + 'A'));
//        }
//        // using charactor
//        for (char ch = 'a'; ch <= 'z'; ch ++){
//            System.out.println(ch);
//        }

        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0) {
                System.out.println((char) (i + 'a'));
            }
        }

    }
}

