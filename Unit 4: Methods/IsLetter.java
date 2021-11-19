import java.util.Scanner;
public class IsLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        System.out.println(isLetter(line));
    }
    public static boolean isLetter(String istolethiscodefromseyon){
        if(istolethiscodefromseyon.length() > 1){
            return false;
        }
        if(istolethiscodefromseyon.charAt(0) >= 'a' && istolethiscodefromseyon.charAt(0) <= 'z' || istolethiscodefromseyon.charAt(0) >= 'A' && istolethiscodefromseyon.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }
}
