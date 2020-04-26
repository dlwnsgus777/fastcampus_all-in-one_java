package example;

public class HeapSort implements Sort {
	
	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeapSort ascedning.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort ¿‘¥œ¥Ÿ.");
	}
}
