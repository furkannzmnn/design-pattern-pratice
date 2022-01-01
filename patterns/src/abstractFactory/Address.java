package abstractFactory;

public abstract class Address {
    private final String address;
    private final String city;

    protected abstract String getCountryCode();

    protected Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
