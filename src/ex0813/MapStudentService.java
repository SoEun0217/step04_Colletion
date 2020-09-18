package ex0813;

import java.util.Map;
import java.util.TreeMap;

public class MapStudentService {

	Person person = new Person();
	MapStudentController msc = new MapStudentController();

	private Map<String, Person> map = new TreeMap<String, Person>();
	// String id�� key�̰�, Person Ÿ���� value��.
	// key ���� ������ �� �ִ� TreeMap�� �̿��� ���̴�

	/**
	 * map�� Person or Student�� �����ؼ� �����Ѵ�(�ʱ�ġ ������ ����)
	 */
	public MapStudentService() {
		map.put("jang", this.create("jang", "������", 20)); // Person
		map.put("kim", this.create("kim", "����", 25));
		map.put("girl", this.create("girl", "��ҿ�", 30));

		map.put("king", this.create("king", "���߱�", 28, 80, 90, 85)); // Student
		map.put("queen", this.create("queen", "������", 20, 90, 70, 95)); // Student
		map.put("lee", this.create("lee", "��ȿ��", 33, 90, 60, 75)); // Student

	}

	/**
	 * ó�� �ʱ�ġ������ ������ ���� ��ü�� �����ؼ� �������ִ� �޼ҵ�
	 * 
	 * @return : Person or Student �̱� ������ Person����..
	 */

	public Person create(String id, String name, int age, int... param) {
		// int...param �� �Ű������� ������ �޴� �� (���� ����)
		// Person�� ��(������ ���� ��), student�� ��(������ ���� ��) ��� Ŀ�� ����

		if (param.length == 0) {// param�� �ȵ����� person
			return new Person(id, name, age);
		} else { // param�� ������ student
			return new Student(id, name, age, param[0], param[1], param[2]);
		}

	}

	/**
	 * ��ü�˻��ϱ�
	 */

	public Map<String, Person> selectAll() {
		return null;
	}

	/**
	 * key(�л� id)�� �ش��ϴ� ���� �˻� :key�ش��ϴ� ������ ����Ҷ� [ Person�ΰ��� �̸��� ��� Student�ΰ��� �̸���
	 * ���� ��� ] -> EndView���� ���°��� "id�� �����ϴ�." ���ܹ߻�
	 */
	public Person searchByKey(String key) {// student�ϼ��� �ְ� person�ϼ��� �ֱ� ������
		// �ΰ��� ��� ���� ������ Person����
		return null;
	}

	/**
	 * ��� : key�� Person�� ������ �޾� ����ϴ� �޼ҵ� ����� �����ϸ�(id�ߺ�üũ!!) ���ܹ߻���Ų��. - throw new
	 * XxxException("key�� �ߺ��Դϴ�") ("��ϵ��� �ʾҽ��ϴ�.") :����ó���� ������ �� ���̴� (�ֳĸ� ���ܰ� �߻��ϸ� ���߱�
	 * ������ ������ ���α׷��� �����ϵ���) ...�޼ҵ� ����� ���� throws XxxException{}
	 */
	public void insert(Person person) {// Student or Person

	}

	/**
	 * ���� : id�� �ش��ϴ� value�� �������� ������ ���ܹ߻� (�������� �ʾҽ��ϴ�.)
	 */
	public void delete(String id) {

	}

	/**
	 * ���� ����, Person�ΰ�� - �̸��� ���� Student�ΰ�� - �̸�, ���� ,����,���м���(���� ����)
	 * 
	 * ������ �ȵȴٸ� ���ܹ߻�
	 * 
	 */
	public void update(Person person) {

	}

}
