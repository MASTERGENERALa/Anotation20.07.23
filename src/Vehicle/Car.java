package Vehicle;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int year, int numOfDoors) {
        super(brand, year);
        this.numOfDoors = numOfDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numOfDoors);
    }
}

