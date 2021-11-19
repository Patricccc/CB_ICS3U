import java.util.Scanner;
public class ValidateyOrn {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ans = "";
        System.out.println("Continue (y or n): ");
        ans = scan.nextLine();
        while(!(ans.equals("y") || ans.equals("n"))){
            System.out.println("Continue (y or n): ");
            ans = scan.nextLine();
        }
        System.out.println("done");
    }
}
