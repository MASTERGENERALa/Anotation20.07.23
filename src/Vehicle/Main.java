package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        car.displayInfo();

        Bus bus = new Bus("Mercedes", 2023, 50);
        bus.displayInfo();

        Bike bike = new Bike("Trek");
        bike.drive();

        MyClass.printStaticField();
    }
}

