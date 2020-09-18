package ex0812.set;

public class Member {
	private String name;
	private int age;

	public Member() {
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public int hashCode() {
		System.out.println("hashCode() call....");
		return name.hashCode();// String의 주소값
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() call.....");
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (name.equals(member.getName())) {
				return true;
			}
		}

		return false;
	}
	
	
}
