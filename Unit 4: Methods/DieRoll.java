public class DieRoll {
    public static int dieRoll(){
        int num = (int)Math.floor(6*Math.random()) + 1;
        return num;
    }
    public static void main(String[] args){
        System.out.println("You rolled a " + dieRoll());
    }
}
