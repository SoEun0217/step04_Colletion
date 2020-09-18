package ex0812;

public class VariableArgsExam {
	// public void test(int ...i) {//인수를 0개 이상 허용가능..
	public void test(Object... i) {// Object 타입이 들어오면 모든 타입이 들어올 수 있다!
		System.out.println("호출됨!");

		for (int index = 0; index < i.length; index++) {
			System.out.println(i[index] + "\t");
		}
	}

	public void test2(String s, int... i) {// 첫번째 인수 필수,첫번째 인수는 ...불가, 무조건 마지막 인수만 variableargument가능
		System.out.println("test2 호출됨");
	}

	public static void main(String[] args) {
	VariableArgsExam va=new VariableArgsExam();
	va.test(3);
	va.test();
	va.test(3,2,4);
	va.test(3,5,6,2,7);
	va.test(5.4);
	va.test("아리아리");
	va.test2("a");
	va.test2("바보양", 4);
	}

}
