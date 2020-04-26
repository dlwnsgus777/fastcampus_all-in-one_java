package example;

public class QuickSort implements Sort {

	@Override
	public void ascedning(int[] arr) {
		System.out.println("QuickSort ascedning.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending.");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ.");
	}
}
