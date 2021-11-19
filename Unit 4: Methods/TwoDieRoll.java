public class TwoDieRoll {
    public static int twoDieRoll(){
        int num1 = (int)Math.floor(6*Math.random()) + 1;
        int num2 = (int)Math.floor(6*Math.random()) + 1;
        System.out.print(num1 + " and " + num2 + " ==> total ");
        return num1 + num2;
    }
    public static void main(String[] args){
        System.out.println(twoDieRoll());
    }
}
