import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt();
        int quarters = cents / 25;
        int n1 = cents % 25;
        int dimes = n1 / 10;
        int n2 = n1 % 10;
        int nickels = n2 / 5;
        int n3 = n2 % 5;
        int pennies = n3;
        System.out.println("Quarters " + quarters + ", dimes " + dimes + ", nickels " + nickels + ", pennies " + pennies);
    }
}
