package staticex;

public class Student {
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id,String studentName) {
		this.studentID = id;
		address = "주소없음";
		this.studentName = studentName;
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
