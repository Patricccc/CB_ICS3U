import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();

        System.out.println(findLargest(x, y, z));
    }
    public static double findLargest(double x, double y, double z){
        double max = Integer.MIN_VALUE;
        if(x > y){
            max = x;
            if(z > x){
                max = z;
            }
        }
        else{
            max = y;
            if(z > y){
                max = z;
            }
        }
        return max;
    }
}
