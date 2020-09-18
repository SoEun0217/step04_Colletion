package ex0813.map;

import java.util.Map;
import java.util.Map.Entry;

public class EndView {
	
	/**
	 * 전체출력
	 * @param map
	 */
	public static void printAll(Map<String, Person> map) {
		System.out.println("***Map 정보 List"+map.size()+"명***");
		
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
	 * Key에 해당하는 정보 출력 
	 * Person인 경우에는 이름만 출력
	 * Student인 경우에는 이름과 총점 출력
	 * @param person
	 */
	public static void printSearch(Person person) {
		System.out.println("이름 : "+person.getName());
		if(person instanceof Student) {
			Student student=(Student)person;
			System.out.println("총점 : "+student.getSum());
		}
		
	}
	
	
	/**
	 * 성공 or 실패 메세지 출력
	 * @param message
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
