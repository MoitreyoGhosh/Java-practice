import java.util.Scanner;

class NumberArray {
    private int[] numbers; // This array will store the numbers given by the user

    // Constructor to initialize the array
    public NumberArray(int[] numbers) {
        this.numbers = numbers;
    }
    // ===> WRITE YOUR CODE HERE <===
    public int getMax(){
        int max = numbers[0];
        for(int num: numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    // similarly do for getmin()
    public int getMin() {
        // Assume the first element is the smallest
        // Return the smallest number found
        int min = numbers[0];
        for(int num: numbers){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}

public class W7A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 5 integers from the user and store them in an array
        int[] arr = new int[5]; // Create an array of size 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // Read numbers from user
        }

        // Create an instance of NumberArray and print max & min values
        NumberArray numArray = new NumberArray(arr);
        System.out.println("Max: " + numArray.getMax() + ", Min: " + numArray.getMin());

        scanner.close(); // Close scanner to free resources
    }
}