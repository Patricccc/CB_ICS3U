import java.util.Scanner;
public class CheckAlpha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ans;
        System.out.println("Enter a letter: ");
        ans = scan.nextLine().charAt(0);
        while(Character.isLetter(ans) == false){
            System.out.println("Not a letter. Enter a letter: ");
            ans = scan.nextLine().charAt(0);
        }
        System.out.println("Done.");
        scan.close();
    } 
}
