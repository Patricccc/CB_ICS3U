import java.util.Scanner;
public class Larger2Numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scan.nextInt();
        if(n1 < n2){
            System.out.println("Result: "+n2+" is larger than "+n1);
        }
        else if(n1 > n2){
            System.out.println("Result: "+n1+" is larger than "+n2);
        }
        else{
            System.out.println("Result: The numbers are equal");
        }
    }
}
