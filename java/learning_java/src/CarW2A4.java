import java.util.*;
class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Display method
    void display(int num) {
        System.out.print("Car " + num + ": " + brand + ", Price: " + price);
        if(num==1)
            System.out.println();
    }
}
public class CarW2A4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand1 = sc.next();
        int price1 = sc.nextInt();
        String brand2 = sc.next();
        int price2 = sc.nextInt();

        Car car1 = new Car(brand1, price1);
        Car car2 = new Car(brand2, price2);
        car1.display(1);
        car2.display(2);

        sc.close();
    }
}
