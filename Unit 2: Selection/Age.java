import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        if(age < 12){
            System.out.println("You are a child");
        }
        else if(age >= 12 && age <= 19){
            System.out.println("You are a teen");
        }
        else if(age >= 20 && age <= 65){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a senior citizen");
        }
    }
}
