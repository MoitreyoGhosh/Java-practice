import java.util.Scanner;

public class W8A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Multiplication Not Possible");
            return;
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i <  rows1 ; i++) {
            for (int j = 0; j <  cols2 ; j++) {
                for (int k = 0; k <  cols1 ; k++) {
                    result[i][j] +=  matrix1[i][k] * matrix2[k][j] ;
                }
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j <  cols2 ; j++) {
                System.out.print( result[i][j] );
                if (j < cols2 - 1) {
                    System.out.print(" "); // Ensure no trailing space at end of row
                }
            }
            if(i < rows1 - 1) {
                System.out.println();
            }
            System.out.print("");

        }

        scanner.close();
    }
}