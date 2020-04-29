package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberPark = new Member(300, "Park");
		Member memberKim = new Member(200, "Kim");
	
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();
	}

}
