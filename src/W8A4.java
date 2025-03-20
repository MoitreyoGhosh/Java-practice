import java.util.Scanner;

public class W8A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number > 0){
            if(number == 1) {
                System.out.print("Neither Prime Nor Not-Prime");
            }
            else{
                int flag = 0;
                for (int i = 2; i <= number/2 ; i++) {
                    if(number % i == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.print("Prime");
                }else{
                    System.out.print("Not Prime");
                }
            }
        }else{
            System.out.print("Only Positive Natural Numbers are considered.");
        }
        scanner.close();
    }
}