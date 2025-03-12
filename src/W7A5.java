import java.util.Scanner;

public class W7A5 {
    private String password;

    // Step 1: Constructor to initialize the password variable
    public W7A5(String password) {
        this.password = password; // Assign the passed password to the instance variable
    }

    public boolean isValidPassword(String password){
        if(password.length() < 8) {
            return false;
            }
            boolean hasUpperCase = false;
            boolean hasDigit = false;

            for(char ch: password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
                if(hasDigit && hasUpperCase){
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read password input from user
        String inputPassword = scanner.nextLine();
        scanner.close();
        W7A5 validator = new W7A5(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }

        scanner.close();
    }
}
