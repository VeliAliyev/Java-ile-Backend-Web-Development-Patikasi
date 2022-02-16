public class HomeAddress implements Address{

    private String name;
    private String street;
    private String district;
    private String city;
    private String country;
    private String postCode;

    HomeAddress(String street, String district, String city, String country, String postCode){
        this.name = "Business";
        this.street = street;
        this.district = district;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public String getDistrict() {
        return this.district;
    }

    @Override
    public String getFullAddress() {
        return this.street + " " + " " + this.district + " " + this.city + " " + this.country + " " + this.postCode;
    }
}
