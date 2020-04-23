package polymorphism;

public class GoldCustomer extends Customer {
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
