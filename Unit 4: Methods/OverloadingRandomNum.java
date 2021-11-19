import java.util.Scanner;

public class OverloadingRandomNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int low = s.nextInt();
        int high = s.nextInt();
        int step = s.nextInt();

        System.out.println(randomNumber());
        System.out.println(randomNumber(n));
        System.out.println(randomNumber(low, high));
        System.out.println(randomNumber(low, high, step));
    }
    public static int randomNumber(){
        int out = (int)Math.floor(Math.random() * 6) + 1;
        return out;
    }
    public static int randomNumber(int n){
        int out = (int)Math.floor(Math.random() * n) + 1;
        return out;
    }
    public static int randomNumber(int low, int high){
        int out = (int)Math.floor(Math.random() * (high - low + 1)) + low;
        return out;
    }
    public static int randomNumber(int low, int high, int step){
        int out = (int)Math.floor(Math.random() * (((high - low)/step) + 1)) * step + low;
        return out;
    }
}