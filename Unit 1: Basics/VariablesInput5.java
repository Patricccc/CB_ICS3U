import java.util.Scanner;
public class VariablesInput5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Where were you born?  Enter a string value: ");
        String born = scan.nextLine();
        System.out.println("What is your middle initial? Enter a character: ");
        char initial = scan.nextLine().charAt(0);
        System.out.println("What year were you born?  Enter the 4 digit integer value: ");
        int year = scan.nextInt();
        System.out.println("Pick a number between 16 and 17.  Enter the decimal number: ");
        double number = scan.nextDouble();
        System.out.println("Thank you for your input.");
        System.out.println(born+" is beautiful.");
        System.out.println(initial+", can I call you, \""+initial+"\" - I think you must be "+year+" + "+number+" years old and attend \"Colonel By\".");
    }
}
