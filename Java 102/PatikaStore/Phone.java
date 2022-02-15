public class Phone extends Electronics{
    double battery;
    double camera;
    public Phone(Brand brand, int id, String name, double price, double discount, int stock,
                 String color, int ram, int memory, double displayInches, double battery, double camera ) {
        super(brand, id, name, price, discount, stock, color, ram, memory, displayInches);
        this.battery = battery;
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }
}
