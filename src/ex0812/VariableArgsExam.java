package ex0812;

public class VariableArgsExam {
	// public void test(int ...i) {//�μ��� 0�� �̻� ��밡��..
	public void test(Object... i) {// Object Ÿ���� ������ ��� Ÿ���� ���� �� �ִ�!
		System.out.println("ȣ���!");

		for (int index = 0; index < i.length; index++) {
			System.out.println(i[index] + "\t");
		}
	}

	public void test2(String s, int... i) {// ù��° �μ� �ʼ�,ù��° �μ��� ...�Ұ�, ������ ������ �μ��� variableargument����
		System.out.println("test2 ȣ���");
	}

	public static void main(String[] args) {
	VariableArgsExam va=new VariableArgsExam();
	va.test(3);
	va.test();
	va.test(3,2,4);
	va.test(3,5,6,2,7);
	va.test(5.4);
	va.test("�Ƹ��Ƹ�");
	va.test2("a");
	va.test2("�ٺ���", 4);
	}

}
