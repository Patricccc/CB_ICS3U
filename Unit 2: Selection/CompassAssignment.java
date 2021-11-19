import java.util.Scanner;

public class CompassAssignment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Hey, welcome to my compass selection program! Choose one of the options below to get started.\n(1)Convert bearing to compass\n(2)Convert compass to bearing\nYour choice: ");
        int choice = scan.nextInt();
        boolean valid = false;
        switch(choice){
            case 1:
            System.out.print("Bearing: ");
            int bearing = scan.nextInt();
            if(bearing < 360 && bearing > 0){
                valid = true;
            }
            if(!valid){
                System.out.print("Invalid input, please try again");
            }
            if(bearing == 0){
                System.out.println("Bearing 0 is N");
                break;
            }
            else if(bearing == 45){
                System.out.println("Bearing 45 is NE");
                break;
            }
            else if(bearing == 90){
                System.out.println("Bearing 90 is E");
                break;
            }
            else if(bearing == 135){
                System.out.println("Bearing 135 is SE");
                break;
            }
            else if(bearing == 180){
                System.out.println("Bearing 180 is S");
                break;
            }
            else if(bearing == 225){
                System.out.println("Bearing 225 is SW");
                break;
            }
            else if(bearing == 270){
                System.out.println("Bearing 270 is W");
                break;
            }
            else if(bearing == 315){
                System.out.println("Bearing 315 is NW");
                break;
            }
            if(bearing > 0 && bearing < 45){
                System.out.println("Bearing "+bearing+" is "+"N"+bearing+"E");
                break;
            }
            else if(bearing > 45 && bearing < 90){
                System.out.println("Bearing "+bearing+" is "+"E"+(90-bearing)+"N");
                break;
            }
            else if(bearing > 90 && bearing < 135){
                System.out.println("Bearing "+bearing+" is "+"E"+(90+bearing)+"S");
                break;
            }
            else if(bearing > 135 && bearing < 180){
                System.out.println("Bearing "+bearing+" is "+"S"+(180-bearing)+"E");
                break;
            }
            else if(bearing > 180 && bearing < 225){
                System.out.println("Bearing "+bearing+" is "+"S"+(180+bearing)+"W");
                break;
            }
            else if(bearing > 225 && bearing < 270){
                System.out.println("Bearing "+bearing+" is "+"W"+(270-bearing)+"S");
                break;
            }
            else if(bearing > 270 && bearing < 315){
                System.out.println("Bearing "+bearing+" is "+"W"+(270+bearing)+"N");
                break;
            }
            else if(bearing > 315 && bearing < 360){
                System.out.println("Bearing "+bearing+" is "+"N"+(360-bearing)+"W");
                break;
            }
            break;
            case 2:
            valid = true;
            System.out.print("Compass Direction: ");
            String compass = scan.next();
            if(compass.length() > 4){
                valid = false;
            }
            if (compass.charAt(0) != 'N') {
                if(compass.charAt(0) != 'S'){
                    if(compass.charAt(0) != 'E'){
                        if(compass.charAt(0) != 'W'){
                            valid = false;
                        }
                    }
                }
            }
            for(int i = 1;i <= 2;i++){
                if (compass.charAt(i) >= '0' && compass.charAt(i) <= '9') {
                    valid = true;
                }
                else {
                    valid = false;
                    break;
                }
            }
            if(!valid){
                System.out.print("Invalid input, please try again");
                break;
            }
            if(compass.length() == 1){
                if(compass.charAt(0) == 'N'){
                    System.out.println("Compass N is a bearing of 0");
                    break;
                }
                else if(compass.charAt(0) == 'E'){
                    System.out.println("Compass E is a bearing of 90");
                    break;
                }
                else if(compass.charAt(0) == 'S'){
                    System.out.println("Compass S is a bearing of 180");
                    break;
                }
                else if(compass.charAt(0) == 'W'){
                    System.out.println("Compass W is a bearing of 270");
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            if(compass.length() == 2){
                if(compass.charAt(0) == 'N' && compass.charAt(1) == 'E'){
                    System.out.println("Compass NE is a bearing of 45");
                    break;
                }
                else if(compass.charAt(0) == 'S' && compass.charAt(1) == 'E'){
                    System.out.println("Compass SE is a bearing of 135");
                    break;
                }
                else if(compass.charAt(0) == 'S' && compass.charAt(1) == 'W'){
                    System.out.println("Compass SW is a bearing of 225");
                    break;
                }
                else if(compass.charAt(0) == 'N' && compass.charAt(1) == 'W'){
                    System.out.println("Compass NW is a bearing of 315");
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            int bear = Integer.parseInt(compass.substring(1, 2));
            if(compass.charAt(2) == '0'){
                bear *= 10;
            }
            if(compass.charAt(0) == 'N'){
                if(compass.charAt(3) == 'E'){
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else if(compass.charAt(3) == 'W'){
                    bear = 360 - bear;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            else if(compass.charAt(0) == 'S'){
                if(compass.charAt(3) == 'E'){
                    bear = 180 - bear;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else if(compass.charAt(3) == 'W'){
                    bear += 180;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            else if(compass.charAt(0) == 'E'){
                if(compass.charAt(3) == 'N'){
                    bear = 90 - bear;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else if(compass.charAt(3) == 'S'){
                    bear += 90;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            else if(compass.charAt(0) == 'W'){
                if(compass.charAt(3) == 'N'){
                    bear = 270 - bear;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else if(compass.charAt(3) == 'S'){
                    bear += 270;
                    System.out.println("Compass "+compass+" is a bearing of "+bear);
                    break;
                }
                else{
                    System.out.println("That was not a valid input, please try again.");
                    break;
                }
            }
            else{
                System.out.println("That was not a valid input, please try again.");
                break;
            }
        }
    }
}