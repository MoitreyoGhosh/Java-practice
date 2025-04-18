import java.util.Scanner;
public class W9A2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declaring 5x5 2D char arrays to store input
        char matrix[][]= new char[5][5];
        char reflection[][]= new char[5][5];

        // Input 2D Array using Scanner Class
        for(int line=0;line<5; line++){
            String input = sc.nextLine();
            char seq[] = input.toCharArray();
            if(seq.length==5){
                for(int i=0;i<5;i++){
                    matrix[line][i]=seq[i];
                }
            }
        }
        // Performing the reflection operation
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                reflection[i][j]=matrix[i][4-j];
            }
        }
        // Output the 2D Reflection Array
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                System.out.print(reflection[i][j]);
            }
            if(i < 4) {
                System.out.println();
            }
            System.out.print("");
        }

        sc.close();
    }
}