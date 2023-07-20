package Vehicle;

public class Bike implements Drivable {
    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("Riding the bike - " + brand);
    }
}
