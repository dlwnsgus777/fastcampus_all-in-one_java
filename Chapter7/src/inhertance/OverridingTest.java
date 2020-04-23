package inhertance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 10000;
		
		
		Customer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "���� �ݾ��� " + priceKim);
		
		System.out.println(customerLee.showCustomerInfo() + "���� �ݾ��� " + priceLee);
	}
}
