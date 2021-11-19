import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Temp in F:");
        double fahrenheit;
        fahrenheit = scan.nextDouble( );
        double celsius = (5.0/9)*(fahrenheit-32.0);
        double multiplied = celsius * 10;
        double rounded = Math.round(multiplied);
        double answer = rounded/10;
        System.out.println("Temp in C:\n " + answer);
    }
}
