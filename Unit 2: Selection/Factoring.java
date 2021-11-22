import java.io.*;
import java.util.*;

public class Factoring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int x = 50;
		int a = -1, b = -1, c = -1, d = -1;
		String neg = "";
		if (A < 0) {
			A *= -1;
			B *= -1;
			C *= -1;
			neg = "-";
		}
		int gcf = A;
		gcf = gcd(gcf, Math.abs(B));
		gcf = gcd(gcf, Math.abs(C));
		A /= gcf;
		B /= gcf;
		C /= gcf;
		if (C == 0) {
			System.out.println(neg + ((gcf == 1) ? "" : gcf) + "x(" + ((A == 1) ? "" : A) + "x" + ((B < 0) ? "-" : "+") + Math.abs(B) + ")");
			return;
		}

		boolean valid = false;
		for (a = 1;a <= x;a++) {
			for (b = -x;b <= x;b++) {
				for (c = 1;c <= x;c++) {
					for (d = -x;d <= x;d++) {
						if (a * c == A && b * c + a * d == B && b * d == C) {
							valid = true;
							break;
						}
					}
					if (valid) break;
				}
				if (valid) break;
			}
			if (valid) break;
		}
		String outside = neg + ((gcf == 1) ? "" : Integer.toString(gcf));
		String ans = "(" + ((a == 1) ? "" : a ) + "x" + ((b < 0) ? "-" : "+") + Math.abs(b) + ")";
		if (-b * 1.0 / a < -d * 1.0 / c) ans += "(" + ((c == 1) ? "" : c ) + "x" + ((d < 0) ? "-" : "+") + Math.abs(d) + ")";
		else ans = "(" + ((c == 1) ? "" : c ) + "x" + ((d < 0) ? "-" : "+") + Math.abs(d) + ")" + ans;
		System.out.println(outside + ans);
		scan.close();
	}
	public static int gcd (int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
}