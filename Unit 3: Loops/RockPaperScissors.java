import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a, b, c;
        int p1 = 0, p2 = 0, p3 = 0;
        boolean tie = false;

        a = scan.nextLine();
        a = a.replaceAll("\\s+", "");
        a = a.toLowerCase();
        while(!(a.equals("rock") || a.equals("paper") || a.equals("scissors"))){
            System.out.println(a+" is an invalid input, please try again: ");
            a = scan.nextLine();
            a = a.replaceAll("\\s+", "");
            a = a.toLowerCase();
        }
        b = scan.nextLine();
        b = b.replaceAll("\\s+", "");
        b = b.toLowerCase();
        while(!(b.equals("rock") || b.equals("paper") || b.equals("scissors"))){
            System.out.println(b+" is an invalid input, please try again: ");
            b = scan.nextLine();
            b = b.replaceAll("\\s+", "");
            b = b.toLowerCase();
        }
        c = scan.nextLine();
        c = c.replaceAll("\\s+", "");
        c = c.toLowerCase();
        while(!(c.equals("rock") || c.equals("paper") || c.equals("scissors"))){
            System.out.println(c+" is an invalid input, please try again: ");
            c = scan.nextLine();
            c = c.replaceAll("\\s+", "");
            c = c.toLowerCase();
        }

        if(a.equals("rock")){
            if(b.equals("rock")){
                if(c.equals("rock")) tie = true;
                else if(c.equals("paper")) p3++;
                else{
                    p1++;
                    p2++;
                }
            }
            if(b.equals("paper")){
                if(c.equals("rock")) p2++;
                else if(c.equals("paper")){
                    p2++;
                    p3++;
                }
                else tie = true;
            }
            else{
                if(c.equals("rock")){
                    p1++;
                    p3++;
                }
                else if(c.equals("paper")) tie = true;
                else p1++;
            }
        }
        else if(a.equals("paper")){
            if(b.equals("rock")){
                if(c.equals("rock")){
                    p2++;
                    p3++;
                }
                else if(c.equals("paper")){
                    p1++;
                    p3++;
                }
                else tie = true;
            }
            if(b.equals("paper")){
                if(c.equals("rock")){
                    p1++;
                    p2++;
                }
                else if(c.equals("paper")) tie = true;
                else p3++;
            }
            else{
                if(c.equals("rock")) tie = true;
                else if(c.equals("paper")) p2++;
                else{
                    p2++;
                    p3++;
                }
            }
        }
        else{
            if(b.equals("rock")){
                if(c.equals("rock")){
                    p2++;
                    p3++;
                }
                else if(c.equals("paper")) tie = true;
                else p2++;
            }
            if(b.equals("paper")){
                if(c.equals("rock")) tie = true;
                else if(c.equals("paper")) p1++;
                else{
                    p1++;
                    p3++;
                }
            }
            else{
                if(c.equals("rock")) p3++;
                else if(c.equals("paper")){
                    p1++;
                    p2++;
                }
                else tie = true;
            }
        }

        if(tie == true) System.out.println("Tie");
        System.out.println("Points for player 1: "+p1);
        System.out.println("Points for player 2: "+p2);
        System.out.println("Points for player 3: "+p3);
        System.out.println("The winner is "+max(p1, p2, p3));
    }
    public static String max(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        String out = "";
        if(a > max){
            max = a;
            out = "player 3";
        }
        if(b > max){
            max = b;
            out = "player 2";
        }
        if(c > max){
            max = c;
            out = "player 1";
        }
        return out;
    }
}