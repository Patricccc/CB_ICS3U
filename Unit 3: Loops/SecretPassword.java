import java.util.Scanner;

public class SecretPassword {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String pass = scan.nextLine();
        while(!pass.equals("coded")){
            System.out.println("Enter Password: ");
            pass = scan.nextLine();
        }
        System.out.println("Access Granted!");
    }
}
