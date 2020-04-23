package inhertance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 10000;
		
		
		Customer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + priceKim);
		
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + priceLee);
	}
}
