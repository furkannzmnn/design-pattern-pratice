package abstractFactory;

public class UsFactory implements AbstractFactory{
    @Override
    public Address createAddress() {
        return new UsAddress("US","LONDON");
    }
}
