import java.util.Scanner;
public class MathCalculationsPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Square Root");
        System.out.println("Input a positive number:");
        int n1 = scan.nextInt();
        System.out.println("The square root of "+n1+" is "+Math.sqrt(n1)+"\n\n****\n");
        System.out.println("Exponents");
        System.out.println("Input an integer:");
        int n2 = scan.nextInt();
        System.out.println("Input a second integer:");
        int n3 = scan.nextInt();
        System.out.println(n2+" to the power of "+n3+" is: "+ Math.pow(n2, n3)+"\n\n****\n");
        System.out.println("Rounding, Ceiling and Floor");
        System.out.println("Input a decimal value:");
        double d1 = scan.nextDouble();
        System.out.println(d1+" rounds to "+Math.round(d1)+"\n"+d1+" ceiling is "+Math.ceil(d1)+"\n"+d1+" floor is "+Math.floor(d1)+"\n\n****\n");
        System.out.println("Random");
        System.out.println("Enter the lower limit:");
        int l1 = scan.nextInt();
        System.out.println("Enter the upper limit:");
        int l2 = scan.nextInt();
        System.out.print("A random number between "+l1+" and "+l2+" is "+Math.floor((l2-l1)*Math.random()+l1));
    }
}