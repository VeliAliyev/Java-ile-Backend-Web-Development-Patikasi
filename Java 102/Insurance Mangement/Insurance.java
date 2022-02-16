import java.util.Calendar;
import java.util.Date;

public abstract class Insurance {

    String name;
    Double price;
    Date startDate;
    Date endDate;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract double calculate(User user);

}
