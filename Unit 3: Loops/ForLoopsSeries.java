import java.util.Scanner;
public class ForLoopsSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double sum = 0.0;
        for(double i = 1.0;i <= 1000.0;i++){
            sum += (1/i);
        }
        System.out.println(sum);
        sum = 0.0;
        for(double i = 100.0;i <= 5000.0;i += 100){
            sum += Math.sqrt(i);
        }
        System.out.println(sum);
        sum = 1.0;
        for(double i = 1;i <= 20.0;i++){
            sum *= i;
        }
        System.out.println((long)sum);
        sum = 0.0;
        for(double i = -12.0;i <= 20.0;i++){
            sum += Math.pow(i, 3);
        }
        System.out.println((int)sum);
        sum = 0.0;
        for(double i = 1.0;i <= 25.0;i++){
            sum += Math.pow(i, 1/i);
        }
        System.out.println(sum);
        scan.close();
    }
}
