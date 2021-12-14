import java.util.Scanner;
public class ClassMethodsFractionClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Fraction p = new Fraction(scan.nextInt(), scan.nextInt());
        Fraction q = new Fraction(scan.nextInt(), scan.nextInt());
        Fraction.product(p, q).print();
        Fraction.abs(q).print();

        System.out.println(Fraction.isPositive(p));
        System.out.println(Fraction.isPositive(q));
    }
}

class Fraction {
    int num, den;

    public Fraction(int a, int b){
        this.num = a;
        this.den = b;
        if(this.den < 0){
            this.num *= -1;
            this.den *= -1;
        }
    }

    public static Fraction product(Fraction a, Fraction b){
        Fraction ans = new Fraction(a.num, a.den);
        ans.num *= b.num;
        ans.den *= b.den;
        ans.reduce();
        return ans;
    }

    public static Fraction abs(Fraction a){
        Fraction ans = new Fraction(a.num, a.den);
        ans.num = (int)Math.abs(ans.num);
        ans.den = (int)Math.abs(ans.den);
        ans.reduce();
        return ans;
    }

    public static boolean isPositive(Fraction a){
        if(a.num > 0 && a.den > 0) return true;
        return false;
    }

    public void print(){
        System.out.println(this.num + "/" + this.den);
    }

    public void reduce(){
        int gcf = gcd(this.num, this.den);
        this.num /= gcf;
        this.den /= gcf;
    }

    public static int gcd(int A, int B){
        A = (int)Math.abs(A);
        B = (int)Math.abs(B);
        if(A < B) return gcd(B, A);
        return(B == 0) ? A : gcd(B, A % B);
    }
}
