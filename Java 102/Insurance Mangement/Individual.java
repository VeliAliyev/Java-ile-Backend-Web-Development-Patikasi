public class Individual extends Account{
    public Individual(User user) {
        this.user = user;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurance.setPrice(insurance.getPrice()+350);
        this.insurances.add(insurance);
    }

}
