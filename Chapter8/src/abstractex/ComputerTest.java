package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.thisplay();
		computer.turnOff();
		
		Computer myNote = new MyNoteBook();
	}
}
