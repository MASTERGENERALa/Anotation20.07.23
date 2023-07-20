package Vehicle;

@CustomAnnotation(value = "This is a custom annotation on Bus class.")
public class Bus extends Vehicle {
    private int capacity;

    public Bus(String brand, int year, int capacity) {
        super(brand, year);
        this.capacity = capacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " passengers");
    }
}

