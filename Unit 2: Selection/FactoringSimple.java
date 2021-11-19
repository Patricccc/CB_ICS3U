import java.io.*;
import java.util.*;

public class FactoringSimple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String negative = "";
		if (a < 0) {
			a *= -1;
			b *= -1;
			c *= -1;
			negative = "-";
		}
		int gcf = a;
		if (b != 0) gcf = gcd(gcf, Math.abs(b));
		if (c != 0) gcf = gcd(gcf, Math.abs(c));
		a /= gcf;
		b /= gcf;
		c /= gcf;
		
		if (c == 0) {
			if(b > 0){
				System.out.println(negative + ((gcf == 1) ? "" : gcf) + "x(" + a + "x+" + b + ")");
			}
			else{
				b *= -1;
				System.out.println(negative + ((gcf == 1) ? "" : gcf) + "x(" + a + "x-" + b + ")");
			}
			return;
		}

		int disc = b*b - 4*a*c;
		if(disc > 0){
			int x1 = (-1*b + (int)Math.sqrt(disc))/(2*a);
			int x2 = (-1*b - (int)Math.sqrt(disc))/(2*a);
			if(x1 > 0){
				System.out.print(negative+((gcf==1) ? "" : gcf)+"(x-"+x1+")");
				if(x2 > 0){
					System.out.println("(x-"+x2+")");
				}
				else{
					x2 *= -1;
					System.out.println("(x+"+x2+")");
				}
			}
			else{
				x1 *= -1;
				System.out.print(negative+((gcf==1) ? "" : gcf)+"(x+"+x1+")");
				if(x2 > 0){
					System.out.println("(x-"+x2+")");
				}
				else{
					x2 *= -1;
					System.out.println("(x+"+x2+")");
				}
			}
		}
		else{
			int x = (-1*b)/(2*a);
			if(x < 0){
				x *= -1;
				System.out.println(negative+((gcf==1) ? "" : gcf)+"(x-"+x+")(x-"+x+")");
			}
			else{
				x *= -1;
				System.out.println(negative+((gcf==1) ? "" : gcf)+"(x+"+x+")(x+"+x+")");
			}
		}
	}
	public static int gcd (int a, int b) {
		if (a < b) return gcd(b, a);
		return (b == 0) ? a : gcd(b, a % b);
	}
}