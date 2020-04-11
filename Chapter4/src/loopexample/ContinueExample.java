package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 != 0) {
				continue;
			}
			System.out.println(num);
		}
	}

}
