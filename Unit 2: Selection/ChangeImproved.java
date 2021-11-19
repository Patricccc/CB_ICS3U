import java.util.Scanner;
public class ChangeImproved {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount less than $1");
        int cents;
        cents = scan.nextInt();
        int quarters = cents/25;
        int num1 = cents%25;
        int dimes = num1/10;
        int num2 = num1%10;
        int nickels = num2/5;
        int num3 = num2%5;
        int pennies = num3;
        String changepennies = (pennies + " pennies");
        String changenickels = (nickels + " nickels");
        String changedimes = (dimes + " dimes");
        String changequarters = (quarters + " quarters");

        String changepenniesSingular = (pennies + " penny");
        String changenickelsSingular = (nickels + " nickel");
        String changedimesSingular = (dimes + " dime");
        String changequartersSingular = (quarters + " quarter");
        System.out.println("Your change is:");

        if (quarters > 0) {
            if (quarters == 1) {
                System.out.print(changequartersSingular);
            }
            if (quarters > 1) {
                System.out.print(changequarters);
            }
            if (nickels > 0 || dimes > 0 || pennies > 0) {
                System.out.print("\n");
            }
        }
        if (dimes > 0) {
            if (dimes == 1) {
                System.out.print(changedimesSingular);
            }
            if (dimes > 1) {
                System.out.print(changedimes);
            }
            if (nickels > 0 || pennies > 0) {
                System.out.print("\n");
            }
        }
        if (nickels > 0) {
            if (nickels == 1) {
                System.out.print(changenickelsSingular);
            }
            if (nickels > 1) {
                System.out.print(changenickels);
            }
            if (pennies > 0) {
                System.out.print("\n");
            }
        }
        if (pennies > 0) {
            if (pennies == 1) {
                System.out.print(changepenniesSingular);
            }
            if (pennies > 1) {
                System.out.print(changepennies);
            }
        }
    }
}
