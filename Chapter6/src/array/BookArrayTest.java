package array;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] libaray = new Book[5];
		
		libaray[0] = new Book("�¹���1", "������");
		libaray[1] = new Book("�¹���2", "������");
		libaray[2] = new Book("�¹���3", "������");
		libaray[3] = new Book("�¹���4", "������");
		libaray[4] = new Book("�¹���5", "������");
		
		for (int i = 0; i < libaray.length; i++) {
			libaray[i].showBookInfo();
		}
	}

}
