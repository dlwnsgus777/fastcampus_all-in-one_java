package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		Student studentkim = new Student(101, "kim");
		studentkim.setKoreaSubject("국어", 80);
		studentkim.setMathSubject("수학", 99);
		
		studentLee.showStudentScore();
		studentkim.showStudentScore();
	}

}
