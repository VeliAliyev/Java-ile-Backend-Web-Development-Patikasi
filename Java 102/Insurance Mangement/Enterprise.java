public class Enterprise extends Account{

    @Override
    public void addInsurance(Insurance insurance) {

        insurance.setPrice(insurance.getPrice()+5350);
        this.insurances.add(insurance);
    }

}
