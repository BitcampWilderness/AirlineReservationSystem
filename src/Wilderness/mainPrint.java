package Wilderness;

public class mainPrint {
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~[���߿� ���� ������ ȯ���մϴ�]~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Join join = new Join();
		
		join.members.add(new MemberMNG("admin", "admin", "Nam Ju"));

		join.run();
	
		
	}

	
}