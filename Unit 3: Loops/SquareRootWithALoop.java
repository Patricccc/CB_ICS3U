import java.util.Scanner;
public class SquareRootWithALoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number (or negative number to quit): ");
        double n = scan.nextDouble();
        while(n > 0){
            double root = Math.round(1000.0*Math.sqrt(n))/1000.0;
            System.out.println("Square root is: "+root+"\n");
            System.out.println("Enter a positive number (or negative number to quit): ");
            n = scan.nextDouble();
        }
        scan.close();
    }
}
