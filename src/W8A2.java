import java.util.Scanner;

public class W8A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        long factorial = 1;
        if (n >= 0) {
            if (n == 0) {
                factorial = 1;
            } else {
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
            }
            System.out.print(factorial);
        } else {
            return;
        }
    }
}