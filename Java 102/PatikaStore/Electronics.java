public abstract class Electronics extends Product{
    int ram;
    int memory;
    double displayInches;

    public Electronics(Brand brand, int id, String name, double price, double discount, int stock,
                       String color, int ram, int memory, double displayInches) {
        super(brand, id, name, price, discount, stock, color);
        this.ram = ram;
        this.memory = memory;
        this.displayInches = displayInches;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return memory;
    }

    public double getDisplayInches() {
        return displayInches;
    }
}
