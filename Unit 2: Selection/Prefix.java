import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prefix {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while (!input.equals("0")) {
			String[] prefix = input.split(" ");
			boolean[] used = new boolean[prefix.length];
			input = input.replaceAll(" ", "");
			ArrayList<Integer> q = new ArrayList<Integer>();
			int index = input.indexOf("+");
			while (index >= 0) {
				if (index != -1)
					q.add(index);
				index = input.indexOf("+", index + 1);
			}
			index = input.indexOf("-");
			while (index >= 0) {
				if (index != -1)
					q.add(index);
				index = input.indexOf("-", index + 1);
			}
			Collections.sort(q);

			String postfix = "";

			if (q.size() == 0)
				System.out.print(input);
			for (int i = q.size() - 1; i >= 0; i--) {
				boolean past = false;
				String operator = prefix[q.get(i)];
				used[q.get(i)] = true;
				String p1 = prefix[q.get(i) + 1];
				used[q.get(i) + 1] = true;
				String p2 = "";
				if (p1.equals("+") | p1.equals("-")) {
					for (int x = q.get(i) + 2; x < used.length; x++) {
						if (used[x] == false) {
							p2 = prefix[x];
							if (x > Arrays.asList(used).indexOf(true))
								past = true;
							used[x] = true;
							break;
						}
					}
				} else {
					p2 = prefix[q.get(i) + 2];
					used[q.get(i) + 2] = true;
				}

				if (p1.equals("+") | p1.equals("-") && past == false) {
					postfix = postfix + " " + operator + " ";
					postfix = postfix + " " + p2 + " ";
				} else if (p1.equals("+") | p1.equals("-") && past == true) {
					postfix = postfix + " " + p2 + " ";
					postfix = postfix + " " + operator + " ";
				} else if (p2.equals("+") | p2.equals("-")) {
					postfix = postfix + " " + operator + " ";
					postfix = p1 + " " + postfix + " ";
				} else {
					postfix = p1 + " " + p2 + " " + operator + " " + postfix + " ";
				}
			}
			System.out.println(postfix);
			input = s.nextLine();
		}
		s.close();
	}
}