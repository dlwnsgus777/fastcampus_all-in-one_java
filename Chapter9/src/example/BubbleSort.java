package example;

public class BubbleSort implements Sort {
	
	@Override
	public void ascedning(int[] arr) {
		System.out.println("BubbleSort ascedning.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort �Դϴ�.");
	}
	
}
