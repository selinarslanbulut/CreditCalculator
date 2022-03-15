import java.util.List;

public class Application {

    private List<Credit> credits;
    private Customer customer;

    public Application(List<Credit> credits,Customer customer) {
        this.credits = credits;
        this.customer=customer;
    }

    void customerApplication(int year,double price){

        if(credits.size()>0){
            System.out.println(customer.getName()+ " Kredi isteği tutarları :");
            for(Credit credit:credits){
                credit.calculate(year,price);
            }
        }
        else {
            System.out.println("Lütfen kredi türü giriniz!");
        }


    }
}
