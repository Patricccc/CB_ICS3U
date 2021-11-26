import java.util.Scanner;
public class StudentClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[4];
        for(int i = 0;i < 4;i++){
            students[i] = new Student();
            students[i].fname = scan.next();
            students[i].lname = scan.next();
            students[i].age = scan.nextInt();
            students[i].grade = scan.nextInt();
        }
        System.out.println(students[0].fname);
        System.out.println(students[1].lname);
        System.out.println(students[2].age);
        System.out.println(students[3].grade);
        scan.close();
    }
}
class Student {
    public String fname, lname;
    public int age, grade;
}
