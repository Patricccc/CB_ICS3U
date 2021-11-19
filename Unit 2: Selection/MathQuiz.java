import java.util.Scanner;
public class MathQuiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.println("Simple Math Quiz\n");
        System.out.println("Question 1:\n5+2 =");
        int n1 = scan.nextInt();
        if(n1 == 7){
            System.out.println("Correct.\n");
            counter++;

        }
        else{
            System.out.println("Incorrect. 5+2 = 7\n");
        }
        System.out.println("Question 2:\n3*6 =");
        int n2 = scan.nextInt();
        if(n2 == 18){
            System.out.println("Correct.\n");
            counter++;
        }
        else{
            System.out.println("Incorrect. 3*6 = 18\n");
        }
        System.out.println("Question 3:\n88-3 =");
        int n3 = scan.nextInt();
        if(n3 == 85){
            System.out.println("Correct.\n");
            counter++;
        }
        else{
            System.out.println("Incorrect. 88-3 = 85\n");
        }
        System.out.println("Score: "+counter+"/3");
    }
}
