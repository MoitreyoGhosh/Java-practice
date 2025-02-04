import java.util.Scanner;
class Stud{
    String name;
    int age;
    String grade;

    public Stud(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grade: " + grade);
    }
}

public class StudentW2A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade = sc.next();

        Stud student = new Stud(name, age, grade);
        student.displayInfo();

        sc.close();
    }
}


