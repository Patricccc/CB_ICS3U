import java.util.Scanner;
public class Fractions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("numerator= ");
        int num = scan.nextInt();
        System.out.println("denominator= ");
        int denom = scan.nextInt();
        System.out.print(num+" / "+denom+" is equivalent to "+(int)Math.floor(num/denom)+" and "+num%denom+" / "+denom);
    }
}
