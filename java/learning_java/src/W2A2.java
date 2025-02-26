import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        if (grade != null && !grade.isEmpty()) {
            System.out.println("Grade: " + grade);
        }
    }
}

public class W2A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter name: ");
        String name = sc.nextLine();

//        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

//        System.out.print("Enter grade (press enter to skip): ");
        String grade = sc.nextLine();

        Student student;
        if (grade.isEmpty()) {
            student = new Student(name, age);
        } else {
            student = new Student(name, age, grade);
        }
        student.displayInfo();
        sc.close();
    }
}
