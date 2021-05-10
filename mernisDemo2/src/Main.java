
import Adapters.MernisServiceAdapters;
import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters() {
		});
		customerManager.save(new Customer(1,"MERT","EKIZLER",1995,"35170092210"));
		

	}

}
