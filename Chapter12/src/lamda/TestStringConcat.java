package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("hello", "World");
		
		concat.makeString("hello", "World");
	}

}
