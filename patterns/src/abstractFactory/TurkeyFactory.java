package abstractFactory;

public class TurkeyFactory implements AbstractFactory{

    @Override
    public Address createAddress() {
        return new TurkeyAddress("AKEVLER", "ISTANBUL");
    }
}
