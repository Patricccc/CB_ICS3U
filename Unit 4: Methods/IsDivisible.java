import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        System.out.println(isDivisible(x, y));
    }
    public static boolean isDivisible(int x, int y){
        return x % y == 0;
    }
}
