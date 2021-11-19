import java.util.Scanner;
public class Rank3Numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0, other = 0;
        System.out.println("Enter 3 integer values:");
        int[] num = new int[3];
        for(int i = 0;i < 3;i++){
            num[i] = scan.nextInt();
            if(num[i] > max){
                max = num[i];
                x = i;
            }
            if(num[i] < min){
                min = num[i];
                y = i;

            }
        }
        for(int i = 0;i < 3;i++){
            if(i != x){
                if(i != y){
                    other = num[i];
                }
            }
        }
        System.out.println(min+", "+other+", "+max);
    }
}
