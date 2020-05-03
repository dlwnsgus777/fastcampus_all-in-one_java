package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte2 = new Latte(americano);
		kenyaLatte2.brewing();
		
		System.out.println();
		
		Mocha etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaMocha.brewing();
		
	}

}
