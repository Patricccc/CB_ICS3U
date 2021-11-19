import java.util.Scanner;
public class ForLoopsTimesTables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i <= n;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
