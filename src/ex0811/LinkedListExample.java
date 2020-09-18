package ex0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		List<String>list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();//nanotime은 억만분의 일초이다.
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));//앞쪽에 추가해준다는것이 중요하다.
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+(endTime-startTime)+"ns");
		
		startTime =System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
			
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime)+"ns");
	}

}
