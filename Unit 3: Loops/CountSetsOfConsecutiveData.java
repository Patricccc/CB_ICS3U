import java.util.Scanner;
public class CountSetsOfConsecutiveData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, counter = 0;
        x = scan.nextInt();
        y = x;
        while(x != 0){
            x = scan.nextInt();
            if(x == y) counter++;
            y = x;
        }
        System.out.println("There are "+counter+" cases of consecutive values");
    }
}
