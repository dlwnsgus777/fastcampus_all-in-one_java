package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] libaray = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		libaray[0] = new Book("태백산맥1", "조정래");
		libaray[1] = new Book("태백산맥2", "조정래");
		libaray[2] = new Book("태백산맥3", "조정래");
		libaray[3] = new Book("태백산맥4", "조정래");
		libaray[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < libaray.length; i++) {
			copyLibrary[i].setAuthor(libaray[i].getAuthor());
			copyLibrary[i].setTitle(libaray[i].getTitle());
		}
		
		libaray[0].setTitle("나목");
		libaray[0].setAuthor("박완서");
		
		for (Book book : libaray) {
			book.showBookInfo();
		}
		
		System.out.println("===============================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
