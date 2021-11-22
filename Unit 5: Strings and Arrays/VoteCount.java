import java.util.Scanner;
public class VoteCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        String str = scan.next();
        int a = 0, b = 0;

        for(int i = 0;i < v;i++){
            if(str.charAt(i) == 'A') a++;
            else b++;
        }

        if(a == b) System.out.println("Tie");
        else if(a > b) System.out.println("A");
        else System.out.println("B");
        scan.close();
    }
}
