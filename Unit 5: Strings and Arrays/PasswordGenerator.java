import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1, s2, s3, str = "";
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();
        
        str = s1.substring(0, 1).toUpperCase();
        str += s2.substring(0, 1).toUpperCase();
        str += s3.substring(0, 1).toUpperCase();

        int length = (int) Math.abs(s1.length() - s2.length());
        str += length;

        int index = s1.indexOf("a");
        if(index % 2 == 0 && index < 10) str += index;
        else str += "#";

        s3 = s3.replaceAll("\\s+", "");
        if(s3.length() >= 3) str += s3.substring(s3.length() - 3, s3.length()).toLowerCase();
        else{
            str += s3.toLowerCase();
            for(int i = 0;i < 3 - s3.length();i++){
                str += "%";
            }
        }

        System.out.println(str);
        scan.close();
    }
}
