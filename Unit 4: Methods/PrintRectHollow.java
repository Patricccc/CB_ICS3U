import java.util.Scanner;
public class PrintRectHollow {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char c;
        int width, height;
        c = scan.nextLine().charAt(0);
        width = scan.nextInt();
        height = scan.nextInt();
        printRectHollow(c, width, height);
    }
    public static void printRectHollow(char c, int width, int height){
        for(int i = 0;i < height;i++){
            if(i == 0 || i == height - 1){
                for(int j = 0;j < width;j++){
                    System.out.print(c);
                }
            }
            else{
                for(int j = 0;j < width;j++){
                    if(j == 0 || j == width - 1){
                        System.out.print(c);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
