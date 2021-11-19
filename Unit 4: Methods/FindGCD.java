import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        System.out.println(gcd(x,y));
    }
    public static int gcd(int A, int B){
        if(A<B) return gcd(B,A);
        return(B==0)?A:gcd(B,A%B);
    }
}
