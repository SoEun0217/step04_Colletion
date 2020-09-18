package ex0811;

import java.util.ArrayList;

class Test {
	int a = 100;

	public void aa() {
	}
}

////////////////////////////////

class ArrayListExam extends ArrayList<Object> {
	// List�� ��ӹ޾Ƽ� �̹� �� List��.

	// ���� Variable
	// Object Ÿ��1��, int Ÿ�� 1��;
	Object object;
	int i;

	// Constractor

	public ArrayListExam() {
		// �ʱ� �뷮 5�� ���� ArrayList�� �����ڸ� ȣ���ؾߵǹǷ� super(5)�� �ؾߵ�.
		// ArrayList�� int�� �����ڸ� ȣ��
		super(5);
	}

	// method
	// method�̸� ����Ÿ�� �μ�

	/*
	 * addInt ���� ����(int)1�� �ϴ��� : �μ��� ���� ������ ��ü�� ����� list�� �߰�.
	 */
	public void addInt(int i) {
		Integer integer = new Integer(i);
		// ����Ʈ�� �����Ѵ�.
		//super.add(integer);// ���� List�� ��ӹ޾ұ� ������ super this ���� �ٰ���
		super.add(i);//����ڽ��� �Ȱ� -i�� Integer�� �ڵ���ȯ�̵Ȱ�
	}

	/*
	 * addFloat ���� �Ǽ�(float)1�� �ϴ��� : �μ��� ���� �Ǽ��� ��ü�� ����� list�� �߰�.
	 */
	public void addFloat(float f) {
		Float fnew = new Float(f);
		add(fnew);
		// this.add(new Float(f));
	}

	/*
	 * addString ���� String ���ڿ�1�� �ϴ��� : �μ��� ���� String �� list�� �߰�.
	 */
	public void addString(String s) {
		Test t = new Test();
		add(t);
		add(s);
	}

	/*
	 * printList ���� ���� ������ ���������� ���� list�� ����ִ� ��ü�� ���� �Է��� �� �������� ���. List�� ����� �� ��ü��
	 * �ɹ������� �������� ���
	 */
	public void printList() {
		this.i = super.size();
		System.out.println("lits�� ����ִ� ��ü�� ����" + i);
		for (int j = 0; j < i; j++) {
			this.object = super.get(j);
			System.out.println("object : " + object);
		}
		
		
		System.out.println("-------������ for��----");
		for(Object obj:this) {//���� ���� ������ �������Ƿ� �� �ڽ��� List�̴�.
			System.out.println(obj);//get���� ������ �۾��� ���� ���ص���!
		}
		
		
		
		System.out.println();
		this.object = super.get(2);// Test��ü
		// object.a;//�θ�Ÿ������ �ڽĺκ��� ���ٺҰ�
		System.out.println("object �ּ�" + object);
		if (object instanceof Test) {
			Test t = (Test) object;
			System.out.println("t�ּ� : " + t);
			System.out.println(t.a);
		}//�������� �ƹ�Ÿ���̳� �� ������ �ٽ� ������ ����Ϸ��� Ÿ���� �������ִ� ���ŷο��� �����.
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
 * ������
 * 
 * list�� ����ִ� ��ü�� �� ������=3 5 5.5 newString
 * 
 * Normal Termination ��� �Ϸ� (0�� ���).
 */