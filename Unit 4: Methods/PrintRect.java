import java.util.Scanner;
public class PrintRect {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char c;
        int width, height;
        c = scan.nextLine().charAt(0);
        width = scan.nextInt();
        height = scan.nextInt();
        printRect(c, width, height);
    }
    public static void printRect (char c, int width, int height){
        for(int i = 0;i < height;i++){
            for(int j = 0;j < width;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
