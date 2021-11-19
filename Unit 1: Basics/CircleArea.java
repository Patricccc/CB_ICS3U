import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scan.nextInt();
        final double pi = 3.14;
        System.out.println("A = "+pi*radius*radius*10/10+" units ^2");
        System.out.print("C = "+2*pi*radius*10/10+" units");
    }
}
