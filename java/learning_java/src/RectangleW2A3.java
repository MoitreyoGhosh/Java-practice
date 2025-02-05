import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        if (length > 0 && breadth > 0) {
            this.length = length;
            this.breadth = breadth;
        }
        else {
            System.out.println("Invalid");
        }
    }

    int area(){
        return length * breadth;
    }
}
public class RectangleW2A3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        System.out.print(rect.area());

        sc.close();
    }
}

