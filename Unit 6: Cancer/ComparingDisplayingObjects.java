import java.util.Scanner;
public class ComparingDisplayingObjects {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Child child1 = new Child(scan.nextInt(), scan.nextDouble());
        Child child2 = new Child(scan.nextInt(), scan.nextDouble());
        Child child3 = new Child(scan.nextInt(), scan.nextDouble());
        System.out.println("Child 1 vs Child 2 - " + child1.equals(child2));
        System.out.println("Child 2 vs Child 3 - " + child2.equals(child3));
        System.out.println("Child 3 vs Child 1 - " + child3.equals(child1));

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        scan.close();
    }
}

class Child {
    private int height;
    private double mass;

    public Child(int a, double b){
        this.height = a;
        this.mass = b;
    }

    public boolean equals(Child other){
        if(this.height <= other.height + 2 && this.height >= other.height - 2){
            if(this.mass <= other.mass + 0.5 && this.mass >= other.mass - 0.5) return true;
        }
        return false;
    }

    public String toString(){
        double bmi = 10000.0*this.mass/(this.height * this.height);
        if(bmi <= 18.0) return "Child - bad";
        else return "Child - good";
    }
}