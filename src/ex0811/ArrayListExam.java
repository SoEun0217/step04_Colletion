package ex0811;

import java.util.ArrayList;

class Test {
	int a = 100;

	public void aa() {
	}
}

////////////////////////////////

class ArrayListExam extends ArrayList<Object> {
	// List를 상속받아서 이미 난 List다.

	// 전역 Variable
	// Object 타입1개, int 타입 1개;
	Object object;
	int i;

	// Constractor

	public ArrayListExam() {
		// 초기 용량 5개 생성 ArrayList의 생성자를 호출해야되므로 super(5)로 해야됨.
		// ArrayList의 int형 생성자를 호출
		super(5);
	}

	// method
	// method이름 리턴타입 인수

	/*
	 * addInt 없음 정수(int)1개 하는일 : 인수로 받은 정수를 객체로 만들어 list에 추가.
	 */
	public void addInt(int i) {
		Integer integer = new Integer(i);
		// 리스트에 저장한다.
		//super.add(integer);// 내가 List를 상속받았기 때문에 super this 생략 다가능
		super.add(i);//오토박싱이 된것 -i를 Integer로 자동변환이된것
	}

	/*
	 * addFloat 없음 실수(float)1개 하는일 : 인수로 받은 실수를 객체로 만들어 list에 추가.
	 */
	public void addFloat(float f) {
		Float fnew = new Float(f);
		add(fnew);
		// this.add(new Float(f));
	}

	/*
	 * addString 없음 String 문자열1개 하는일 : 인수로 받은 String 을 list에 추가.
	 */
	public void addString(String s) {
		Test t = new Test();
		add(t);
		add(s);
	}

	/*
	 * printList 없음 없음 정수형 전역변수에 현재 list에 들어있는 객체의 개수 입력한 후 전역변수 출력. List에 저장된 각 객체를
	 * 맴버변수에 저장한후 출력
	 */
	public void printList() {
		this.i = super.size();
		System.out.println("lits에 들어있는 객체의 갯수" + i);
		for (int j = 0; j < i; j++) {
			this.object = super.get(j);
			System.out.println("object : " + object);
		}
		
		
		System.out.println("-------개선된 for문----");
		for(Object obj:this) {//지금 아직 생성을 안했으므로 내 자신이 List이다.
			System.out.println(obj);//get으로 꺼내는 작업을 따로 안해도됨!
		}
		
		
		
		System.out.println();
		this.object = super.get(2);// Test객체
		// object.a;//부모타입으로 자식부분을 접근불가
		System.out.println("object 주소" + object);
		if (object instanceof Test) {
			Test t = (Test) object;
			System.out.println("t주소 : " + t);
			System.out.println(t.a);
		}//넣을때는 아무타입이나 잘 들어가지만 다시 꺼내서 사용하려면 타입을 변경해주는 번거로움이 생긴다.
	}

	public static void main(String args[]) {
		ArrayListExam list = new ArrayListExam();
		String s = new String("newString");
		list.addInt(5);
		list.addFloat(5.5F);
		list.addString(s);
		list.printList();
	}
}

/*
 * 실행결과
 * 
 * list에 들어있는 객체의 총 개수는=3 5 5.5 newString
 * 
 * Normal Termination 출력 완료 (0초 경과).
 */