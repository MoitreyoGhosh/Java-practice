import java.util.Scanner;
public class W1A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j <= (i+1); j++) {
                System.out.print("*");
            }
            if (i != n-2) {
                System.out.println();
            }
            sc.close();
        }
    }
}
