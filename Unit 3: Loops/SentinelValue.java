import java.util.Scanner;
public class SentinelValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentinel value: ");
        int sentinel = scan.nextInt();
        System.out.println("Enter an integer: ");
        int value = scan.nextInt();
        while(value != sentinel){
            System.out.println("Enter an integer: ");
            value = scan.nextInt();
        }
        System.out.println("Stop");
    }
}
