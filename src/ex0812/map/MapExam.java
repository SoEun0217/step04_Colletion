package ex0812.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	Map<Integer, String> map = new HashMap<Integer, String>();
	// Map<Integer, String>map=new TreeMap<Integer,String>();//key���� ������ �ȴ�.

	/**
	 * map�� ������ �߰�
	 */
	public void addMap() {
		map.put(10, "���߱�");
		map.put(50, "�����");
		map.put(40, "�����");
		map.put(20, "�ڵ���");
		map.put(30, "�ڱ��");
		map.put(40, "���ֿ�");
		map.put(70, "�赵��");// key�� �ߺ��Ǹ� �߰����ȵǴ��� ����Ⱑ �Ǵ���?->����Ⱑ �ȴ�!��ü�� �ȴ�.
	}

	/**
	 * map�� �ִ� ������ ������
	 */
	public void printMap() {
		System.out.println("���� : " + map.size());
		System.out.println(map);

		// map�� �ִ� ��� key�� ������ ��������
		Set<Integer> kset = map.keySet();
		Iterator<Integer> it = kset.iterator();
		while (it.hasNext()) {// ������Ұ� �����Ѵٸ�
			Integer key = it.next();
			// key�� �ش��ϴ� value ��������
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println("keySet()�� ������ for������ �����غ���");
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}

		System.out.println("-------------------------------");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		System.out.println("entrySet()�� ������ for������ �����غ���");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {// Entry�� Set�� �� <generic>����� ����!�ƴϸ������!!!!
			// ��Ȯ�ϰ� Map.Entry�� ���ּ���
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}
	}

	/**
	 * key�� �ش��ϴ� value�˻��ϱ� ������ "key�� �̸��� ~�Դϴ�." ������ "key�� ���K�� �ʽ��ϴ�.."
	 */

	public void searchByKey(Integer key) {// key�� �˰� �ֱ� ������ for���� �ʿ�����

		/** containsKey�޼ҵ� ����ϱ�...
		if (map.containsKey(key)) {
			String value = map.get(key);
			System.out.println(key + "�� �̸��� " + value + "�Դϴ�.");
		} else
			System.out.println(key + "�� �������� �ʽ��ϴ�.");
		
		*/
		String value=map.get(key);
		if(value==null) {
			System.out.println(key + "�� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(key + "�� �̸��� " + value + "�Դϴ�.");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.addMap();
		me.printMap();
		me.searchByKey(10);

	}

}
