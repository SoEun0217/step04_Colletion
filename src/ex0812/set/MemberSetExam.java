package ex0812.set;

import java.util.HashSet;

public class MemberSetExam extends HashSet<Member> {
	public MemberSetExam() {
		super.add(new Member("±è¼ÒÀº",20));
		System.out.println("-----------------");
		super.add(new Member("±è»ì±¸",2));
		System.out.println("-----------------");
		super.add(new Member("±è¼ÒÀº",20));
		
		System.out.println("ÃÑ °³¼ö : "+super.size());
	}
	
	
	
	
	public static void main(String[] args) {
		new MemberSetExam();
	}

}
