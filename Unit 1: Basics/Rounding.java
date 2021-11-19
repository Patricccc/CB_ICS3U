import java.util.Scanner;
public class Rounding {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number = scan.nextDouble();
        System.out.println("Number of decimal places: ");
        int n = scan.nextInt();
        System.out.print((Math.round(number * Math.pow(10, n)))/Math.pow(10, n));
    }
}
