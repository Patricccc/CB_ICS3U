public class StudentInstanceMethods {
    public static void main(String[] args) {
        String[] n = {"Adam", "Bert", "Cansu", "David", "Ernie"};
        int[] a = {12, 13, 14, 15, 16};
        String[] add = {"123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON"};
        String[] p = {"613-555-3333", "613-555-3333", "613-555-2312"};


        Student[] students = new Student[4];

        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            students[i].name = n[i];
            students[i].age = a[i];
            students[i].address = add[i];
            students[i].phone = p[i];
            students[i].email = "enter";
            students[i].setStudentPassword();
        }

        students[0].email = "mom@gmail.com";

        students[3] = new Student();
        students[3].name = n[3];
        students[3].age = a[3];
        students[3].copyHomeInfo(students[0]);
        students[3].setStudentPassword();

        for (int i = 0;i <= 3;i++) students[i].print();
        System.out.println("Password check:  " + students[0].checkPassword("no"));
        String pass = students[0].password;
        System.out.println("Valid password check: " + students[0].checkPassword(pass));
    }
}

class Student {
    String name, address, phone, email, password;
    int age;

    public void print(){
        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + this.name);
        System.out.println("Age          | " + this.age);
        System.out.println("Password     | " + this.password);
        System.out.println("---------------------------");
        System.out.println("CONTACT INFO |             ");
        System.out.println("Address      | " + this.address);
        System.out.println("Phone        | " + this.phone);
        System.out.println("Email        | " + this.email);
        System.out.println("-------------------------------------------------");
    }

    public void setStudentPassword(){
        this.password = this.name.charAt(1) + Integer.toString(this.age%10) + this.address.charAt(0) + this.phone.substring(3, 6);
    }

    public boolean checkPassword(String password){
        return password == this.password;
    }

    public void copyHomeInfo(Student other){
        this.address = other.address;
        this.phone = other.phone;
        this.email = other.email;
    }
}
