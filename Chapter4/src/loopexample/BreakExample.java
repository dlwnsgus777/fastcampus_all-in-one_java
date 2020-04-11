package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; sum <= 100; num++) {
			sum += num;
			
			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println(sum);
	}

}
