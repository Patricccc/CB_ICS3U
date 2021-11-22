import java.util.Scanner;
public class SnowCalls {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num[] = new String[n];
		String out = "";
		int j = 0;

		for (int i = 0; i < n; i++){
			num[i] = scan.next();
			num[i] = num[i].replace("-", "");
		}
		
		for (int i = 0; i < n; i++){
			do{
				if (out.length() == 3 || out.length() == 7) {
					out = out + "-";
				}
				if (num[i].charAt(j) == 'A' || num[i].charAt(j) == 'B' || num[i].charAt(j) == 'C'){	
					out = out + "2";
				} else if (num[i].charAt(j) == 'D' || num[i].charAt(j) == 'E' || num[i].charAt(j) == 'F'){	
					out = out + "3";
				} else if (num[i].charAt(j) == 'G' || num[i].charAt(j) == 'H' || num[i].charAt(j) == 'I'){	
					out = out + "4";
				}else if (num[i].charAt(j) == 'J' || num[i].charAt(j) == 'K' || num[i].charAt(j) == 'L'){	
					out = out + "5";
				}else if (num[i].charAt(j) == 'M' || num[i].charAt(j) == 'N' || num[i].charAt(j) == 'O'){	
					out = out + "6";
				}else if (num[i].charAt(j) == 'P' || num[i].charAt(j) == 'Q' || num[i].charAt(j) == 'R' || num[i].charAt(j) == 'S'){	
					out = out + "7";
				}else if (num[i].charAt(j) == 'T' || num[i].charAt(j) == 'U' || num[i].charAt(j) == 'V'){	
					out = out + "8";
				}else if (num[i].charAt(j) == 'W' || num[i].charAt(j) == 'X' || num[i].charAt(j) == 'Y' || num[i].charAt(j) == 'Z'){	
					out = out + "9";
				}else{
					out = out + num[i].charAt(j);
				}
				j++;
			}while (out.length() < 12);
			System.out.println(out);
			out = "";
			j = 0;
		}
		scan.close();
	}
}
