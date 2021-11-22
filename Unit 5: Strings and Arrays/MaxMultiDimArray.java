import java.util.Scanner;
public class MaxMultiDimArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int in;
        int[][] arr = new int[r][];
        for(int i = 0;i < r;i++){
            in = scan.nextInt();
            arr[i] = new int[in+1];
            arr[i][0] = in;
            for(int j = 1;j < arr[i].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(max(arr));
        scan.close();
    }
    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
}
