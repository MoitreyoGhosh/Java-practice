import java.util.Scanner;

public class CylinderVol {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter the height: ");
        double height = in.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.printf("Volume is %.2f",volume);
        in.close();
    }
}
