import java.util.Scanner;

public class FractionGettersSetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[4];
        int[] dens = new int[4];
        for (int i = 0;i < 4;i++) {
            nums[i] = scan.nextInt();
            dens[i] = scan.nextInt();
        }
        
        Fraction a = new Fraction(nums[0], dens[0]);
        Fraction b = new Fraction(nums[1], dens[1]);
        Fraction c = new Fraction();
        Fraction d = new Fraction();

        System.out.println(a.getNumerator());
        System.out.println(a.getDenominator());
        System.out.println(b.getNumerator());
        System.out.println(b.getDenominator());

        c.setNumerator(nums[2]);
        c.setDenominator(dens[2]);
        d.setNumerator(nums[3]);
        d.setDenominator(dens[3]);

        d.invert();

        a.print();
        b.print();
        c.print();
        d.print();
        scan.close();
    }
}

class Fraction {
    int num, den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public Fraction(int a, int b){
        if(b >= 0){
            this.num = a;
            this.den = b;
        }
        else{
            this.num = -a;
            this.den = -b;
        }
    }

    public void print(){
        System.out.println(this.num + "/" + this.den);
    }

    public int getNumerator(){
        return this.num;
    }

    public int getDenominator(){
        return this.den;
    }

    public void setNumerator(int n){
        this.num = n;
    }

    public void setDenominator(int n){
        if(n >= 0) this.den = n;
        else{
            this.den = -n;
            this.num = -this.num;
        }
    }

    public void invert(){
        int x = this.num;
        this.num = this.den;
        this.den = x;
        if(this.den < 0){
            this.den *= -1;
            this.num *= -1;
        }
    }
}
