import java.util.Calendar;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance() {
        this.name = "Residence Insurance";
        Calendar calendar = Calendar.getInstance();
        this.startDate = calendar.getTime();
        calendar.add(Calendar.YEAR,5);
        this.endDate = calendar.getTime();
    }

    @Override
    public double calculate(User user) {
        this.price = user.getAge() * 1062.10;
        return this.price;
    }
}
