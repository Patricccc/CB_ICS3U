import java.util.Scanner;
public class UsingArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*Q1
        After the foor loop,
            list[0] = 3 - 0 = 3
            list[1] = 3 - 1 = 2
            list[2] = 3 - 2 = 1
            list[3] = 3 - 3 = 0
        Therefore the program would print
        4
        0
        3
        */
        //Q2
        int[] sample = new int[10];
        //a
        for(int i = 0;i < 10;i++){
            sample[i] = scan.nextInt();
        }
        //b
        int temp = sample[0];
        sample[0] = sample[9];
        sample[9] = temp;
        //c
        for(int i = 0;i < 10;i++){
            if(sample[i] < 0){
                sample[i] *= -1;
            }
        }
        //d
        int sampleSum = 0;
        for(int i = 0;i < 10;i++){
            sampleSum += sample[i];
        }
        System.out.println(sampleSum);
        //e
        for(int i = 0;i < 10;i++){
            if(i % 2 == 0){
                System.out.print(sample[i] + " ");
            }
        }
        scan.close();
    }
}