package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] libaray = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		libaray[0] = new Book("�¹���1", "������");
		libaray[1] = new Book("�¹���2", "������");
		libaray[2] = new Book("�¹���3", "������");
		libaray[3] = new Book("�¹���4", "������");
		libaray[4] = new Book("�¹���5", "������");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < libaray.length; i++) {
			copyLibrary[i].setAuthor(libaray[i].getAuthor());
			copyLibrary[i].setTitle(libaray[i].getTitle());
		}
		
		libaray[0].setTitle("����");
		libaray[0].setAuthor("�ڿϼ�");
		
		for (Book book : libaray) {
			book.showBookInfo();
		}
		
		System.out.println("===============================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
