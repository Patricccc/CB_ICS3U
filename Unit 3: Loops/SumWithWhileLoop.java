import java.util.Scanner;
public class SumWithWhileLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        while(n < 0){
            System.out.println("Invalid input.\nEnter N: ");
            n = scan.nextInt();
        }
        int i = 1, sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("The sum of the first "+n+" integers is "+sum);
        scan.close();
    }
} 
