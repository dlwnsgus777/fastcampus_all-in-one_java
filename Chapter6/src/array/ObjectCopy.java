package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] libaray = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		libaray[0] = new Book("�¹���1", "������");
		libaray[1] = new Book("�¹���2", "������");
		libaray[2] = new Book("�¹���3", "������");
		libaray[3] = new Book("�¹���4", "������");
		libaray[4] = new Book("�¹���5", "������");
		
		System.arraycopy(libaray, 0, copyLibrary, 0, 5);
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		libaray[0].setTitle("����");
		libaray[0].setAuthor("�ڿϼ�");
		
		System.out.println("===============================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
