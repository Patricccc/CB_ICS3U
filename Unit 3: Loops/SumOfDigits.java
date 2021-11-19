import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long ans;
        System.out.println("Enter a positive integer: ");
        ans = scan.nextInt();
        while(ans <= 0){
            System.out.println("Enter a positive integer: ");
            ans = scan.nextInt();
        }
        long num = ans;
        long sum = 0;
        while(ans > 0){
            sum += ans%10;
            ans /= 10;
        }
        System.out.println("Sum of "+num+"'s digits is "+sum);
    }
}
