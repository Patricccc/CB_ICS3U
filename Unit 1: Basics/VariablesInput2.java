import java.util.Scanner;
public class VariablesInput2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mass: ");
        double myMass = scan.nextDouble();
        System.out.print("Your mass is "+myMass+" kg.");
    }
}
