package abstractFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    private Logger logger = Logger.getLogger(Application.class.getName());
    private AbstractFactory abstractFactory;

    public Application(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void print(){
        Address address = abstractFactory.createAddress();
        logger.log(Level.WARNING ,address.getAddress());
        logger.log(Level.WARNING ,address.getCity());
        logger.log(Level.WARNING ,address.getCountryCode());
        logger.log(Level.WARNING , address.toString());
    }
}
