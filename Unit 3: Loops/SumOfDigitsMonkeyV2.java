import java.util.Scanner;

public class SumOfDigitsMonkey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = scan.nextInt();
        while(n <= 0){
            System.out.println("Enter a positive integer: ");
            n = scan.nextInt();
        }
        int sum = 0, i = 0;
        String str = Integer.toString(n);
        do{
            sum += Character.getNumericValue(str.charAt(i));
            i++;
        }while(i < str.length());
        System.out.println("Sum of "+n+"'s digits is "+sum);
        scan.close();
    }
}
