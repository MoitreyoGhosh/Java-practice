import java.sql.SQLOutput;
import java.util.Scanner;

public class W8A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number > 0){
            int digit, reverse_Number = 0;
            while(number != 0){
                digit = number % 10;
                reverse_Number = reverse_Number * 10 + digit;
                number /= 10;
            }
            System.out.print(reverse_Number);
        }else{
            return;
        }

        scanner.close();
    }
}

