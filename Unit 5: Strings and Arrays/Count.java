import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char c = scan.nextLine().charAt(0);
        String s = scan.nextLine();

        c = Character.toLowerCase(c);
        s = s.replaceAll("\\s+", "");
        s = s.toLowerCase();

        System.out.println(count(c, s));
        scan.close();
    }
    public static int count(char c, String s){
        int counter = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == c) counter++;
        }
        return counter;
    }
}
