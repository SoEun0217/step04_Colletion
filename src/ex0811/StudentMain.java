package ex0811;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		// 1.���
		boolean re = service.insert(new Student("aa", "�����", 24, "����"));
		System.out.println("��ϰ�� : re=" + re);
		re = service.insert(new Student("bb", "�����", 24, "����"));
		System.out.println("��ϰ�� : re=" + re);
		re = service.insert(new Student("cc", "�����", 24, "����"));
		System.out.println("��ϰ�� : re=" + re);

		// 2.��ü�˻�
		List<Student> list = service.selectAll();
		System.out.println(list.size() + "��");
		for (Student st : list) {
			System.out.println(st);
		}
		// 3.id�� �ش��ϴ� ���� �˻�
		System.out.println("3.id�� �ش��ϴ� ���� �˻�");
		Student student = service.searchById("vsvs");
		if (student == null)
			System.out.println("������ �����ϴ�..");
		else
			System.out.println("�˻��� �л� \n" + student);

		// 4.id�� �ش��ϴ� ���ڵ� ����
		if (service.delete("aa")) {
			System.out.println("���� �Ǿ����ϴ�.");
		} else
			System.out.println("������ ���� �ʾҽ��ϴ�.");

		System.out.println("���ڵ� ���� ��");
		list = service.selectAll();// ����Ʈ �״�� �����̹Ƿ� Ÿ���� �ٽ� ���������ʴ´�.
		System.out.println(list.size() + "��");
		for (Student st : list) {
			System.out.println(st);
		}

		// 5.id�� �ش��ϴ� ���� ����
		System.out.println("5.id�� �ش��ϴ� ���� ����");
		re = service.update(new Student("Salgu", 5, "�챸��"));// id,age,addr�� ����-�����ϰ����ϴ� ���̵�� ������
		if (re)
			System.out.println("�����Ϸ�");
		else
			System.out.println("�����Ұ�");
		list = service.selectAll();// ����Ʈ �״�� �����̹Ƿ� Ÿ���� �ٽ� ���������ʴ´�.
		System.out.println(list.size() + "��");
		for (Student st : list) {
			System.out.println(st);
		}

	}
}
