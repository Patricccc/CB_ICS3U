import java.util.Scanner;

public class HiddenPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        String s = scan.next();
        for (int i = 0;i < s.length();i++) {
            for (int j = i + 1;j < s.length() + 1;j++) {
                String s1 = "";
                String s2 = s.substring(i, j);
                for (int p = s2.length() - 1;p >= 0;p--) {
                    s1 = s1 + s2.charAt(p);
                }
                if (s2.equals(s1)) {
                    if (s2.length() > a) {
                        a = s2.length();
                    }
                }
            }
        }
        System.out.println(a);
        scan.close();
    }
}
