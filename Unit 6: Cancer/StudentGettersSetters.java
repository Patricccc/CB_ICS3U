import java.util.Scanner;
public class StudentGettersSetters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String adminPass;
        String [] names = {"Adam", "Bert", "Cansu", "David", "Ernie"};
        int [] ages = {12, 13, 14, 15, 16};
        String [] addresses = {"123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON"};
        String [] phones = {"613-555-3333", "613-555-3333", "613-555-2312"};


        Student [] students = new Student[3];

        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            students[i].name = names[i];
            students[i].age = ages[i];
            students[i].address = addresses[i];
            students[i].phone = phones[i];
            students[i].email = names[i]+"mom@gmail.com";
            students[i].setStudentPassword();
        }

        for (int i = 0;i < 3;i++){
            adminPass = scan.nextLine();
            System.out.println("Password check - student " +(i+1) +" : " + students[i].getStudentPassword(adminPass));   
        }

        scan.close();
    }
}

class Student {
    String name, address, phone, email, password;
    int age;

    public void setStudentPassword(){
        this.password = this.name.charAt(1) + Integer.toString(this.age%10) + this.address.charAt(0) + this.phone.substring(3, 6);
    }

    public String getStudentPassword(String adminPass){
        if(adminPass.equals("admin")) return this.password;
        return "invalid";
    }
}
