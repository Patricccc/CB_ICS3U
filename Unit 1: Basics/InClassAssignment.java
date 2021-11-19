import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //line 1
    final String b = "Christmas";
    System.out.print("Twelve days of "+b+"\n");
    //inputting variables
    System.out.print("Enter an integer: ");
    int a = scan.nextInt();
    System.out.print("Enter a boolean value: ");
    boolean c = scan.nextBoolean();
    System.out.print("Enter a double value: ");
    double d = scan.nextDouble();
    System.out.print("Enter a long value: ");
    long e = scan.nextLong();
    System.out.print("Enter a float value: ");
    float f = scan.nextFloat();
    System.out.print("Enter a character: ");
    char g = scan.next().charAt(0);
    System.out.println("\nYour song: ");
    //rounding h to 3 decimal places by multiplying 1000, rounding, then dividing 1000
    double h = d*1000.0;
    h = Math.round(h);
    h /= 1000;
    //typecasting the random variable as an integer and going from 10*a with range 15*a-5
    int i = (int)Math.floor((15*a-5)*Math.random()+10*a);
    //the remainder when i is divided by 100 is the last two digits of the number
    int j = i%100;
    //change
    int quarters, dimes, nickels, pennies;
    //finding the maximum quarters
    quarters = (int)Math.floor(j/25);
    //remaining change
    dimes = j%25;
    //calculating maximum dimes
    dimes = (int)Math.floor(dimes/10);
    //remaining change
    nickels = (int)Math.floor((j - 25*quarters - 10*dimes)/5);
    //calculating pennies
    pennies = j - 25*quarters - 10*dimes - 5*nickels;
    //writing in sentence form
    String l = quarters + " q/" + dimes + " d/" + nickels + " n/" + pennies + " p";
    //writing out the equation
    double m = (Math.sqrt(Math.pow(a,3)-5*Math.pow(a,2)-5)/(3*a+10));
    //rounding to 2 decimals using the method mentioned above
    m = Math.round(m * 100.0);
    m /= 100;
    //solving simple math equations
    double n = h/2 + (f/(80*j));
    double o = ((1/2.0)*Math.pow(a,2))*(e - Math.sin(e));
    //output
    System.out.println("On the "+a+" day of "+b);
    System.out.println("My "+c+" student gave to me:");
    System.out.println(a+" teachers teaching");
    System.out.println(d+" students studying");
    System.out.println(e+" books "+g+"-creaking");
    System.out.println(f+" librarians shushing");
    System.out.println(h+" athletes "+g+"-running");
    System.out.println(i+" coders "+g+"-typing");
    System.out.println(j+" mathletes "+g+"-solving");
    System.out.println(l+" chemist explosions");
    System.out.println(m+" halls blocked");
    System.out.println(n+" lunches passed");
    System.out.println(o+" vice principals");
    System.out.println("And a "+b+" in a \"Colonel By\" school.");
  }
}
