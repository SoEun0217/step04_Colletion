package ex0811;

public class Student {
	private String id;//중복안됨
	private String name;
	private int age;
	private String addr;

	public Student() {
	}

	public Student(String id, String name, int age, String addr) {
		this(id,age,addr);//오버로딩!
		this.name = name;
		
	}
	public Student(String id, int age,String addr) {
		this.id = id;
		this.age = age;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(id+" | ");
		sb.append(name+" | ");
		sb.append(age+" | ");
		sb.append(addr);
		return sb.toString();
	}

}
