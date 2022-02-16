import java.sql.Date;
import java.util.Calendar;

public class CarInsurance extends Insurance{

    public CarInsurance() {
        this.name = "Car Insurance";
        Calendar calendar = Calendar.getInstance();
        this.startDate = calendar.getTime();
        calendar.add(Calendar.YEAR,3);
        this.endDate = calendar.getTime();
    }

    @Override
    public double calculate(User user) {
        this.price = user.getAge()*534.70;
        return this.price;
    }
}
