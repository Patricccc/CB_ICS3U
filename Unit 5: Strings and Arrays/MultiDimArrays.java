import java.util.Scanner;
public class MultiDimArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = c-1;i >= 0;i--){
            for(int j = r-1;j >= 0;j--){
                System.out.print(arr[j][i]);
            }
            System.out.println("");
        }
        scan.close();
    }
}
