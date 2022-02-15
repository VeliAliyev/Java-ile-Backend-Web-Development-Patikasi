import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Store {

    String name;
    ArrayList<Product> products;
    ArrayList<Brand> brands;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.brands = new ArrayList<>();
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public void addBrand(Brand brand) {
        this.brands.add(brand);
    }

}
