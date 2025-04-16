import java.util.Scanner;
public class W12A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read a single character input representing a calculator function key
        char key = sc.next().charAt(0);

        System.out.println(mapFunction(key));
        sc.close();
    }
    // Helper method that maps each calculator key to its function name
    public static String mapFunction(char key) {
        switch (key) {
            case '+': return "Addition";
            case '-': return "Subtraction";
            case '*': return "Multiplication";
            case '/': return "Division";
            case 'R': return "Square Root";
            case 'S': return "Square";
            case 'F': return "Reciprocal";
            case '=': return "Equals";
            case 'C': return "Clear";
            default: return "Unknown Function";
        }
    }
}