package ex0812.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	//Set <String> set=new HashSet<String>();
	Set <String> set=new TreeSet<String>();//데이터정렬
	
	/**
	 * Set에 데이터 추가하기
	 * */
	public void addSet(String [] args) {
		for(String s:args) {
			boolean result=set.add(s);
			//System.out.println(s+" 추가결과 : "+result);
			System.out.printf("%s 추가된 결과 : %b%n",s,result);
		}
		System.out.println("개수 : "+set.size());
	}
	
	/**
	 * Set에 데이터 출력하기
	 * */
	public void printSet() {
		System.out.println("출력하기");
		System.out.println(set);//순서 보장받을 수 없다.
		
		//set에 있는 데이터를 반복자(Iterator)를 통해 가져오기~
		TreeSet<String>treeSet=(TreeSet<String>)set;
		Iterator<String>it=treeSet.descendingIterator();//내림차순~TreeSet에서만 가능해용
		
		//Iterator<String>it=set.iterator();
		while(it.hasNext()) {//다음 요소가 존재한다면
			String s=it.next();//다음요소를 꺼내라.
			System.out.println(s);
		}
		//개선된 for문의 정석이 Iterator을 사용하는 것이다.
		System.out.println("개선된 for문--------------------");
		for(String s:set) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		SetExam se=new SetExam();
		se.addSet(args);
		se.printSet();
	}

}
