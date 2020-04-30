package lamda;

interface PrintString {
	void showString(String str);
}

public class TestLamda {
	
	public static void main(String[] args) {
		PrintString lamdaString = s -> System.out.println(s);
		lamdaString.showString("Test");
		
		showMyString(lamdaString);
		
		PrintString test = returnString();
		test.showString("test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "!!!");
	}
}
