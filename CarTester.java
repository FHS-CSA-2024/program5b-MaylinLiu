import java.util.Scanner;

public class CarTester {
    // Method to add a new car using user input
    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the car's name: ");
        String carName = scanner.nextLine();

        System.out.print("Please enter car's miles: ");
        int miles = scanner.nextInt();

        System.out.print("Please enter car's gallons: ");
        int gallons = scanner.nextInt();

        return new Car(carName, miles, gallons);
    }

    public static void main(String[] args) {
        // Add and print details for two cars
        Car car1 = addCar();
        System.out.println(car1.toString());

        System.out.println("------NEXT CAR-------------------------------------------");

        Car car2 = addCar();
        System.out.println(car2.toString());
    }
}

