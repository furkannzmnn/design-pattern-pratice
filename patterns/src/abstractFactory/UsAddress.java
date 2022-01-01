package abstractFactory;

public class UsAddress extends Address{

    public UsAddress(String address, String city) {
        super(address, city);
    }

    @Override
    protected String getCountryCode() {
        return "US";
    }
}
