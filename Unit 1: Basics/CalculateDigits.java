import java.util.Scanner;
public class CalculateDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive, 4-digit number (1111 to 9999): ");
        int number = scan.nextInt();
        System.out.print("The digits of "+number+" are "+(int)Math.floor(number/1000)%10+", "+(int)Math.floor(number/100)%10+", "+(int)Math.floor(number/10)%10+", and "+number%10+".");
    }
}
