import java.util.Scanner;

public class Equals {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // DO NOT ALTER - this will get your numbers into 2 user entered Arrays
        // you just need to write equals
        int n = s.nextInt();
        double[] myArray = getArray(n);
        int n2 = s.nextInt();
        double[] myArray2 = getArray(n2);
        // call max
        System.out.println(equals(myArray, myArray2));
        scan.close();
    }

    // do not alter the method getArray
    public static double[] getArray(int n) {
        double[] temp = new double[n];
        for (int x = 0; x < n; x++) {
            temp[x] = s.nextDouble();
        }
        return temp;
    }

    public static boolean equals(double[] arr1, double[] arr2){
        if(arr1.length != arr2.length) return false;
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
