import java.util.Scanner;
public class Scores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] occ = new int[11];
        int in = 1, totalocc;
        double sum = 0.0, count = 0.0;
        for(int i = 1;i <= 10;i++){
            occ[i] = 0;
        }
        while(in > 0){
            in = scan.nextInt();
            if(in >= 1 && in <= 10){
                count++;
                occ[in]++;
                sum += in;
            }
        }
        System.out.println("Score   #Occurrences");
        for(int i = 1;i <= 10;i++){
            if(i != 10) System.out.println(i + "       " + occ[i]);
            else System.out.println(i + "      " + occ[i]);
        }
        double avg = Math.round(10.0*sum/count)/10.0;
        System.out.println("Mean: " + avg);
        scan.close();
    }
}
