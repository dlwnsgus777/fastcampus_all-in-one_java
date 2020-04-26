package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			if (this.studentNum == std.studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println("==============================");
		
		Student lee = new Student(100, "�̼���");
		Student lee2 = lee;
		Student shin = new Student(100, "�̼���");
		
		System.out.println(lee == shin);
		System.out.println(lee.equals(shin));
		
		System.out.println(lee.hashCode());
		System.out.println(shin.hashCode());
		
		System.out.println("==============================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
