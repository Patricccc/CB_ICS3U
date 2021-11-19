import java.util.Scanner;

public class CompassAssignmentSeyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hey, welcome to my compass selection program! Choose one of the options below to get started.\n(1)Convert bearing to compass\n(2)Convert compass to bearing\nYour choice: ");
        int choice = scan.nextInt();
        boolean valid = false;
        //initialising constant arrays of special cases;
        final int[] specialbear = { 0, 45, 90, 135, 180, 225, 270, 315 };
        final String[] specialcomp = { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };
        switch (choice) {
            case 1:
                //bearing to compass
                System.out.print("Bearing: ");
                int bearing = scan.nextInt();
                //from 0 to 360
                if (bearing < 360 && bearing >= 0) {
                    valid = true;
                }
                if (!valid) {
                    System.out.print("Invalid input, please try again");
                    break;
                }
                System.out.println("Bearing "+bearing+" is compass "+compass(bearing));
                break;
            case 2:
                valid = true;
                System.out.print("Compass Direction: ");
                String compass = scan.next();
                //length 1, 2 or 4
                if (compass.length() > 4 || compass.length() == 3) {
                    valid = false;
                }
                //if it's length 1 or 2 it has to be a special case, if not invalid
                if(compass.length() == 1 || compass.length() == 2){
                    valid = false;
                    for(int i = 0;i < 8;i++){
                        if(compass.equals(specialcomp[i])){
                            valid = true;
                            break;
                        }
                    }
                }
                //first and last character have to be N, S, E or W
                //this is assuming it's length 4, as it has passed previous tests
                if (compass.charAt(0) != 'N') {
                    if(compass.charAt(0) != 'S'){
                        if(compass.charAt(0) != 'E'){
                            if(compass.charAt(0) != 'W'){
                                valid = false;
                            }
                        }
                    }
                }
                if (compass.length() == 4 && compass.charAt(3) != 'N') {
                    if(compass.charAt(3) != 'S'){
                        if(compass.charAt(3) != 'E'){
                            if(compass.charAt(3) != 'W'){
                                valid = false;
                            }
                        }
                    }
                }
                //making sure the middle characters are digits
                if(compass.length() == 4){
                    for(int i = 1;i <= 2;i++){
                        if (compass.charAt(i) >= '0' && compass.charAt(i) <= '9') {
                            valid = true;
                        }
                        else {
                            valid = false;
                            break;
                        }
                    }
                }
                //first and last character must be different
                if(compass.length() == 4 && compass.charAt(0) == compass.charAt(3)){
                    valid = false;
                }
                if (!valid) {
                    System.out.print("Invalid input, please try again");
                    break;
                }
                System.out.println("Compass "+compass+" is bearing "+bearing(compass));
                break;
            default:
                System.out.print("Invalid input, please try again");
                break;
        }
    }

    public static String compass(int bearing) {
        final int[] specialbear = { 0, 45, 90, 135, 180, 225, 270, 315 };
        final String[] specialcomp = { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };
        String out = "";
        for (int i = 0; i < 8; i++) {
            if (bearing == specialbear[i]) {
                out = specialcomp[i];
                return out;
            }
        }
        //each separate case in a brute-forcey method
        if (bearing > 0 && bearing < 45) {
            out = "N" + bearing + "E";
        } else if (bearing > 45 && bearing < 90) {
            out = "E" + (90 - bearing) + "N";
        } else if (bearing > 90 && bearing < 135) {
            out = "E" + (bearing - 90) + "S";
        } else if (bearing > 135 && bearing < 180) {
            out = "S" + (180 - bearing) + "E";
        } else if (bearing > 180 && bearing < 225) {
            out = "S" + (bearing - 180) + "W";
        } else if (bearing > 225 && bearing < 270) {
            out = "W" + (270 - bearing) + "S";
        } else if (bearing > 270 && bearing < 315) {
            out = "W" + (bearing - 270) + "N";
        } else if (bearing > 315 && bearing < 360) {
            out = "N" + (360 - bearing) + "W";
        }
        return out;
    }

    public static int bearing(String compass){
        final int[] specialbear = { 0, 45, 90, 135, 180, 225, 270, 315 };
        final String[] specialcomp = { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };
        int out = 0;
        for (int i = 0; i < 8; i++) {
            if (compass.equals(specialcomp[i])) {
                out = specialbear[i];
                return out;
            }
        }
        //iterate through all the bearings
        //convert each bearing to compass using the previous method
        //if the converted string is equal to the input, output the associated bearing
        for (int i = 0; i < 360; i++) {
            if(compass.equals(compass(i))){            
                out = i;
                return out;
            }
        }
        return out;
    }
}