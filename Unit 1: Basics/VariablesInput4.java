import java.util.Scanner;
public class VariablesInput4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double mark1, mark2, mark3, mark4, markTotal, average;
        System.out.println("Enter mark 1: ");
        mark1 = scan.nextDouble();
        System.out.println("Marks: "+mark1);
        System.out.println("Enter mark 2: ");
        mark2 = scan.nextDouble();
        System.out.println("Marks: "+mark1+", "+mark2);
        markTotal = mark1 + mark2;
        System.out.println("Mark total is "+markTotal);
        System.out.println("Enter mark 3: ");
        mark3 = scan.nextDouble();
        System.out.println("Marks: "+mark1+", "+mark2+", "+mark3);
        markTotal += mark3;
        System.out.println("Mark total is "+markTotal);
        System.out.println("Enter mark 4: ");
        mark4 = scan.nextDouble();
        System.out.println("Marks: "+mark1+", "+mark2+", "+mark3+", "+mark4);
        markTotal += mark4;
        System.out.println("Mark total is "+markTotal);
        average = markTotal/4.0;
        System.out.print("The average is "+average);
    }   
}
