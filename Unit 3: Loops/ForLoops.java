import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int n1 = scan.nextInt();
        System.out.println("Enter integer 2: ");
        int n2 = scan.nextInt();
        System.out.println("Print asterisks: ");
        for(int i = 0;i < Math.abs(n2-n1);i++){
            System.out.print("*");
        }
        if(n2 > n1){
            System.out.println("\nCountdown seconds: ");
            for(int i = n2; i >= n1;i--){
                System.out.println(i + " seconds");
            }
        } 
        else{
            System.out.println("\nCountdown seconds: ");
            for(int i = n1; i >= n2;i--){
                System.out.println(i + " seconds");
            }
        }
        System.out.println("Enter a letter: ");
        char c1 = scan.next().charAt(0);
        System.out.println("Enter a letter: ");
        char c2 = scan.next().charAt(0);
        for(char j = c1; j <= c2;j++){
            System.out.println("Give me a "+j);
        }
        System.out.println("Output multiples - start at integer 1 and multiply by integer 2 stop when greater than 1000");
        while(n1 < 1000){
            System.out.println(n1);
            n1 *= n2;
        }
    }
}
