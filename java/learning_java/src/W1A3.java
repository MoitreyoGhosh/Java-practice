import java.util.Scanner;
public class W1A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i=1; i<=4; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
        System.out.print(number + " x " + 5 + " = " + (number*5));
        in.close();
    }
}
