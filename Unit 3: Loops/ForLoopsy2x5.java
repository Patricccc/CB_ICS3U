import java.util.Scanner;
public class ForLoopsy2x5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Part a");
        for(int i = 6;i >= 0;i--){
            int val = 2*i + 5;
            System.out.println(i + " --> " + val);
        }
        System.out.println("\nPart b");
        for(int i = 0;i <= 30;i += 3){
            int val = 2*i+5;
            System.out.println(i + " --> " + val);
        }
        System.out.println("\nPart c");
        for(int i = -15;i <= 15;i += 5){
            int val = 2*i+5;
            System.out.println(i + " --> " + val);
        }
        System.out.println("\nPart d");
        for(int i = 1;i <= 1024;i *= 2){
            int val = 2*i+5;
            System.out.println(i + " --> " + val);
        }
        scan.close();
    }
}
