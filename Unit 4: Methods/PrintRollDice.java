import java.util.Scanner;
public class PrintRollDice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printRollDice(n);
    }
    public static void printRollDice(int numDice){
        for(int i = 1;i <= numDice;i++){
            int num = (int)Math.floor(6*Math.random()) + 1;
            System.out.println("Roll " + i + " is a " + num);
        }
    }
}
