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
		
		System.out.println("���� �� : "+list);//�ּҰ����� ȣ��ȴٰ� �����Ҽ� ������ toString()�� �������̵��Ǿ��־ �ٷ� ��µȴ�.
		
		Collections.sort(list);
		
		System.out.println("���� �� : "+list);
	}

	public static void main(String[] args) {
		new LottoExam();
	}

}
