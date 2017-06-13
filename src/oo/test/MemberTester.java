package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(-4);
		System.out.println(member.getAge());
	}
	//phone member
	PhoneMember member2 = new PhoneMember();
	PhoneMember member3 = new PhoneMember("Hank");
}
