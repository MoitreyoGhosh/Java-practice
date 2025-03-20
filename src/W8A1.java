import java.sql.SQLOutput;
import java.util.Scanner;

public class W8A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number > 0){
            int digits_Sum = 0;
             while(number != 0){
                 int digit = number % 10;
                 digits_Sum += digit;
                 number /= 10;
             }
            System.out.print(digits_Sum);
        }
        else{
            return;
        }
        scanner.close();
    }
}
