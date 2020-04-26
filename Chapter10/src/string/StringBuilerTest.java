package string;

public class StringBuilerTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builer = new StringBuilder(java);
		System.out.println(System.identityHashCode(builer));
		builer.append("android");
		System.out.println(System.identityHashCode(builer));
		
		java = builer.toString();
		
	}

}
