import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();
        String rev = "";
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            rev = c + rev;
        }
        if(str.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        return;
    }
}
