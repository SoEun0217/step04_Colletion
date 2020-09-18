package ex0813.map;

import java.util.Map;
import java.util.Map.Entry;

public class EndView {
	
	/**
	 * ��ü���
	 * @param map
	 */
	public static void printAll(Map<String, Person> map) {
		System.out.println("***Map ���� List"+map.size()+"��***");
		
		/*
		 * for(String key:map.keySet()) { Person value=map.get(key);
		 * System.out.println(key+" : "+value);
		 */
		////////////////////////////////////
			for(Entry<String,Person> e:map.entrySet()) {
				System.out.println(e.getKey()+" [ "+e.getValue()+" ] ");
			}
	
		
	}
	
	/**
	 * Key�� �ش��ϴ� ���� ��� 
	 * Person�� ��쿡�� �̸��� ���
	 * Student�� ��쿡�� �̸��� ���� ���
	 * @param person
	 */
	public static void printSearch(Person person) {
		System.out.println("�̸� : "+person.getName());
		if(person instanceof Student) {
			Student student=(Student)person;
			System.out.println("���� : "+student.getSum());
		}
		
	}
	
	
	/**
	 * ���� or ���� �޼��� ���
	 * @param message
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
