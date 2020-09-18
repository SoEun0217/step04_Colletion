package ex0811;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoExam {
	List<Integer>list=new ArrayList<Integer>(6);
	
	public LottoExam() {
		Random r=new Random();
		while(list.size()<6) {
		int no=r.nextInt(45)+1;
		if(!list.contains(no))
			list.add(no);
		}
		
		System.out.println("정렬 전 : "+list);//주소값으로 호출된다고 생각할수 있지만 toString()이 오버라이딩되어있어서 바로 출력된다.
		
		Collections.sort(list);
		
		System.out.println("정렬 후 : "+list);
	}

	public static void main(String[] args) {
		new LottoExam();
	}

}
