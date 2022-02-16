import java.util.Calendar;

public class HealthInsurance extends Insurance{
    public HealthInsurance() {
        this.name = "Health Insurance";
        Calendar calendar = Calendar.getInstance();
        this.startDate = calendar.getTime();
        calendar.add(Calendar.YEAR,1);
        this.endDate = calendar.getTime();
    }

    @Override
    public double calculate(User user) {
        this.price = user.getAge()*753.80;
        return this.price;
    }
}
