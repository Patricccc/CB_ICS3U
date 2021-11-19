import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num:");
        int n1 = scan.nextInt();
        System.out.println("Enter second num:");
        int n2 = scan.nextInt();
        System.out.println("What is "+n1+" mod "+n2+"?");
        int ans = scan.nextInt();
        if(ans == n1%n2){
            System.out.println("Congrats - correct.");
        }
        else{
            System.out.println("Incorrect.\nModulus returns the remainder.\n"+n2+" divides into "+n1+", "+(int)Math.floor(n1/n2)+" times and there is "+n1%n2+" leftover.\n"+n1+" mod "+n2+" is "+n1%n2+".");
        }
    }
}
