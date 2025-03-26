import java.util.Scanner;
public class W9A1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declare the 5X5 2D array to store the input
        char matrix[][]= new char[5][5];

        // Input 2D Array using Scanner Class and check data validity
        for(int line=0;line<5; line++){
            String value = sc.nextLine();
            char seq[] = value.toCharArray();
            if(seq.length==5){
                for(int i=0;i<5;i++){
                    if(seq[i]=='0' || seq[i]=='1'){
                        matrix[line][i]=seq[i];
                        if(line==4 && i==4)
                            flipflop(matrix);
                    }
                    else{
                        System.out.print("Only 0 and 1 supported.");
                        break;
                    }
                }
            }else{
                System.out.print("Invalid length");
                break;
            }
        }
    }
    static void flipflop(char[][] flip){
        // Flip-Flop Operation
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                if(flip[i][j]=='1')
                    flip[i][j]='0';
                else
                    flip[i][j]='1';
            }
        }
        // Output the 2D FlipFlopped Array
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                System.out.print(flip[i][j]);
            }
            if(i < 4) {
                System.out.println();
            }
            System.out.print("");
        }
    }
}
