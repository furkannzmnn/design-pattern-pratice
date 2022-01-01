package abstractFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        AbstractFactory abstractFactory = country.equals("tr") ? new TurkeyFactory() : new UsFactory();
        Application application = new Application(abstractFactory);
        application.print();
    }
}
