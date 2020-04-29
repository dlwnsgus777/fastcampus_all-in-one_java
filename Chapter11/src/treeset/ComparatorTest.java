package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class myCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new myCompare());
		
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for (String srt : treeSet) {
			System.out.println(srt);
		}
	}

}
