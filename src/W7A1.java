import java.util.Scanner;

class W7A1 {
    private int num1;
    private int num2;

// ================================
// TODO: Implement a constructor and four methods for operations.
//       Ensure proper handling for division by zero.
//

// Note: Try solving it without hints first-only check if you're truly stuck.
//       Avoid AI or internet searches; quick answers won't build real skills.
//       Struggle a bit, learn for life! Be honest with yourself!

// HINTS:
// 1. Create a constructor that initializes two numbers.
//    - Use instance variables to store values passed as parameters.
//    - Remember to use 'this' keyword to refer to instance variables.

    public W7A1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//
// 2. Implement four methods: add(), subtract(), multiply(), and divide().
//    - Each method should return an integer value.
//
// 3. Addition and subtraction are straightforward:
//    - Simply return the sum or difference of the two numbers.
//
// 4. Multiplication follows the same pattern as addition and subtraction.
//
// 5. Be careful with the divide() method:
//    - Before performing division, check if the second number is zero.
//    - If it is zero, print an error message and return a default value (like 0)
//      to prevent crashes.
//
// 6. Think about how each method should behave and what value it should return.
//    - Keep the code simple and readable.
//
// 7. Test each method separately with different inputs to ensure correctness.

    public int add(){
        return num1+num2;
    }

    public int subtract(){
        return num1 - num2;
    }

    public int multiply(){
        return num1*num2;
    }

    public double divide(){
        if(num2 == 0){
            System.out.println("Cannot be divided by zero");
            return 0;
        }
        else {
            return (double) num1 / (double) num2;
        }
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    W7A1 calc = new W7A1(a, b);
    System.out.println("Sum: " + calc.add());
    System.out.println("Difference: " + calc.subtract());
    System.out.println("Product: " + calc.multiply());
    System.out.println("Quotient: " + calc.divide());

    scanner.close();
}
}