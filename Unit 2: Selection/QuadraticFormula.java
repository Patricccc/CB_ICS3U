import java.util.Scanner;
public class QuadraticFormula {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quadratic equation a, b and c");
        int solutions = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double min = 0.0, max = 0.0, x1 = 0.0, x2 = 0.0, x1round = 0.0, x2round = 0.0;
        double discriminant = b*b-4.0*a*c;
        if(discriminant > 0){
            solutions = 2;
        }
        else if(discriminant == 0){
            solutions = 1;
        }
        else{
            solutions = 0;
        }
        if(solutions == 2){
            x1 = (((-1*b) + Math.sqrt(discriminant)))/(2.0*a);
            x2 = (((-1*b) - Math.sqrt(discriminant)))/(2.0*a);
            x1round = Math.round(x1*10)/10.0;
            x2round = Math.round(x2*10)/10.0;
        }
        else if(solutions == 1){
            x1 = (-1*b/2*a);
            x1round = Math.round(x1*10)/10.0;
        }
        if(x1round < x2round){
            min = x1round;
            max = x2round;
        }
        else{
            min = x2round;
            max = x1round;
        }
        if(solutions == 2){
            System.out.println("This has two solutions x="+min+" and x="+max);
        }
        else if(solutions == 1){
            System.out.println("This has one solution x="+x1round);
        }
        else{
            System.out.println("This has no solution");
        }
    }
}
