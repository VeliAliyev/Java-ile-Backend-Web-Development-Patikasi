import java.util.Calendar;

public class TravelInsurance extends Insurance{

    public TravelInsurance() {

        this.name = "Travel Insurance";
        Calendar calendar = Calendar.getInstance();
        this.startDate = calendar.getTime();
        calendar.add(Calendar.YEAR,1);
        this.endDate = calendar.getTime();

    }

    @Override
    public double calculate(User user) {
        this.price = user.getAge()*1251.65;
        return this.price;
    }
}
