package abstractFactory;

public class TurkeyAddress extends Address{

    public TurkeyAddress(String address, String city) {
        super(address, city);
    }

    @Override
    protected String getCountryCode() {
        return "TR";
    }
}
