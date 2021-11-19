import java.util.Scanner;
public class VariablesInput3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four course grades: ");
        int[] grades = new int[4];
        int sum = 0;
        for(int i = 0;i < 4;i++){
            grades[i] = scan.nextInt();
            sum += grades[i];
        }
        double avg = sum/4.0;
        System.out.print("The average is: "+avg);
    }
}
