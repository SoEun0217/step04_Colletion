package ex0812.set;

import java.util.HashSet;

public class MemberSetExam extends HashSet<Member> {
	public MemberSetExam() {
		super.add(new Member("�����",20));
		System.out.println("-----------------");
		super.add(new Member("��챸",2));
		System.out.println("-----------------");
		super.add(new Member("�����",20));
		
		System.out.println("�� ���� : "+super.size());
	}
	
	
	
	
	public static void main(String[] args) {
		new MemberSetExam();
	}

}
