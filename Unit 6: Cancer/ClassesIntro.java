import java.util.Scanner;
/* Q1
Fraction frac = new Fraction();
frac.num = 2;
frac.den = 7;
*/
//Q2 The fraction constructor is not called
/*Q3
p becomes 1/3
q becomes 4/3
r becomes 4/3
*/
public class ClassesIntro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        f1.num = scan.nextInt();
        f1.den = scan.nextInt();
        f2.num = scan.nextInt();
        f2.den = scan.nextInt();

        f1.num *= 2;
        f1.print();

        int x = f2.num;
        f2.num = f2.den;
        f2.den = x;
        f2.print();

        f1.num *= f2.num;
        f1.den *= f2.den;
        f1.print();

        x = f1.num;
        x *= f2.den;
        f2.num *= f1.den;
        f2.den *= f1.den;
        f2.num += x;
        f2.print();
        

        f1.num = (int)Math.abs(f1.num);
        f1.den = (int)Math.abs(f1.den);
        f1.print();

        scan.close();
    }
}

class Fraction {
    int num, den;

    public void print(){
        System.out.println(this.num + "/" + this.den);
    }
}