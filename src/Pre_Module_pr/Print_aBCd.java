package Pre_Module_pr;

public class Print_aBCd {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            if (i % 2 == 1) {
                System.out.println((char) (i + 'A'));
            } else if (i % 2 == 0) {
                System.out.println((char) (i + 'a'));
            }
        }
    }
}
