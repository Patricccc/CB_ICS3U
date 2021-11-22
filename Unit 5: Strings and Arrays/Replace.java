import java.util.Scanner;
public class Replace {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char oldChar = scan.nextLine().charAt(0);
        char newChar = scan.nextLine().charAt(0);
        String s = scan.nextLine();
        System.out.println(replace(s, oldChar, newChar));
        scan.close();
    }
    public static String replace(String s, char oldChar, char newChar){
        int j = 0;
        String str = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == oldChar){
                j++;
                if(j % 2 == 0) str += newChar;
                else str += s.charAt(i);
            }
            else str += s.charAt(i);
        }
        return str;
    }
}
