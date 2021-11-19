import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        System.out.println("Enter first number:");
        int n1 = scan.nextInt();
        if(n1 < min){
            min = n1;
        }
        System.out.println("Enter second number:");
        int n2 = scan.nextInt();
        if(n2 < min||n2 == min){
            min = n2;
        }
        System.out.println("Enter third number:");
        int n3 = scan.nextInt();
        if(n3 < min||n3 == min){
            min = n3;
        }
        System.out.println("The smallest number is: "+min);
    }
}
