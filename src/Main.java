import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Credit> credits=new ArrayList<Credit>();
        credits.add(new NeedCredit());
        credits.add(new CarCredit());

        Customer customer1=new Customer(1,"Selin Arslanbulut");

        Application application=new Application(credits,customer1);
        application.customerApplication(2,50000);

    }
}
