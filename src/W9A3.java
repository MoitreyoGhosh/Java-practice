import java.util.Scanner;
public class W9A3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char arr[][] = new char[5][5];

        // Input 2D Array using Scanner Class
        for (int line = 0; line < 5; line++) {
            String input = sc.nextLine();
            char seq[] = input.toCharArray();
            if (seq.length == 5) {
                for (int i = 0; i < 5; i++) {
                    arr[line][i] = seq[i];
                }
            } else {
                System.out.print("Wrong Input!");
                System.exit(0);
            }
        }

        // Declaring the array to store Transition
        char transition[][] = new char[5][5];
        String outer[] = {"00", "10", "20", "30",
                "40", "41", "42", "43",
                "44", "34", "24", "14",
                "04", "03", "02", "01"};
        String inner[] = {"11", "21", "31", "32",
                "33", "23", "13", "12"};

        // 45-Degree rotation
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Transform outer portion
                for (int k = 0; k < outer.length; k++) {
                    char indices[] = outer[k].toCharArray();
                    int a = Integer.parseInt(String.valueOf(indices[0]));
                    int b = Integer.parseInt(String.valueOf(indices[1]));
                    if (a == i && b == j) {
                        if (k == 15) {
                            k = 1;
                        } else if (k == 14) {
                            k = 0;
                        } else {
                            k += 2;
                        }
                        indices = outer[k].toCharArray();
                        a = Integer.parseInt(String.valueOf(indices[0]));
                        b = Integer.parseInt(String.valueOf(indices[1]));
                        transition[a][b] = arr[i][j];
                        break;
                    }
                }

                // Transform inner portion
                for (int k = 0; k < inner.length; k++) {
                    char indices[] = inner[k].toCharArray();
                    int a = Integer.parseInt(String.valueOf(indices[0]));
                    int b = Integer.parseInt(String.valueOf(indices[1]));
                    if (a == i && b == j) {
                        if (k == 7) {
                            k = 0;
                        } else {
                            k += 1;
                        }
                        indices = inner[k].toCharArray();
                        a = Integer.parseInt(String.valueOf(indices[0]));
                        b = Integer.parseInt(String.valueOf(indices[1]));
                        transition[a][b] = arr[i][j];
                        break;
                    }
                }

                // Keeping center same
                transition[2][2] = arr[2][2];
            }
        }
        // Print the transformed output
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transition[i][j]);
            }
            if(i < 4) {
                System.out.println();
            }
            System.out.print("");
        }
    }
}