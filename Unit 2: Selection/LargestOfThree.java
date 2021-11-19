import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("Enter first number:");
        int n1 = scan.nextInt();
        if(n1 > max){
            max = n1;
        }
        System.out.println("Enter second number:");
        int n2 = scan.nextInt();
        if(n2 > max||n2 == max){
            max = n2;
        }
        System.out.println("Enter third number:");
        int n3 = scan.nextInt();
        if(n3 > max||n3 == max){
            max = n3;
        }
        System.out.println("The largest number is: "+max);
    }
}
