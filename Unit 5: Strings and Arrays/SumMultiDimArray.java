import java.util.Scanner;
public class SumMultiDimArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        double[][] arr = new double[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                arr[i][j] = scan.nextDouble();
            }
        }

        System.out.println(sum(arr));
        scan.close();
    }
    public static int sum(double[][] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}