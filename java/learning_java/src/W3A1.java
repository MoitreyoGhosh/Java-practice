import java.util.Scanner;

public class W3A1 {
     static int factorial(int x) {
         if(x==0)
            return  1;
         else
            return (x * factorial(x-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.print(factorial(x));
    }
}
