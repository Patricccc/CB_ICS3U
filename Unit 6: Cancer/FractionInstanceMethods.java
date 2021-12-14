import java.util.Scanner;
/*Q1
a) q
b) q
c) p
d) p
e) p
*/
public class FractionInstanceMethods {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction c = new Fraction();
        Fraction d = new Fraction();

        a.num = scan.nextInt();
        a.den = scan.nextInt();
        b.num = scan.nextInt();
        b.den = scan.nextInt();
        c.num = scan.nextInt();
        c.den = scan.nextInt();

        a.plusEquals(b);
        d = a.plus(c);
        d.reduce();

        a.print();
        b.print();
        c.print();
        d.print();

        scan.close();
    }
}
class Fraction {
    int num, den;

    public void reduce(){
        int gcf = gcd(this.num, this.den);
        this.num /= gcf;
        this.den /= gcf;
    }

    public void plusEquals(Fraction other){
        int x = other.num * this.den;
        this.den *= other.den;
        this.num *= other.den;
        this.num += x;
    }

    public Fraction plus(Fraction other){
        Fraction ans = new Fraction();
        ans.den = this.den * other.den;
        ans.num = this.num * other.den + other.num * this.den;
        return ans;
    }

    public void print(){
        System.out.println(this.num + "/" + this.den);
    }

    public static int gcd(int A, int B){
        if(A < B) return gcd(B, A);
        return(B == 0) ? A : gcd(B, A % B);
    }
}

