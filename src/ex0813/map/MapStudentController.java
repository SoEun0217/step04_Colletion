package ex0813.map;

import java.util.Map;

public class MapStudentController {
	private static MapService service = new MapService();

	/**
	 * ��ü �˻�
	 */
	public static void selectAll() {
		/// service�� ȣ���ϰ� �� ����� �޾Ƽ� EndViewȣ���Ѵ�.service�� �����ؼ� �����ؾ���.
		try {
		Map<String,Person> map =service.selectAll();
		EndView.printAll(map);
		}catch(Exception e) {
			//���ܰ� �߻����� �� �ؾ��� �� �ۼ�
			EndView.printMessage(e.getMessage());//�޼����� �����ۼ��ϴ� ���� �ƴϴ�.���� �߻��� ������ �ۼ��� ���� �ҷ���.
		}
		
	}

	/**
	 * id�� ã�� ���� �˻�
	 */
	public static void searchById(String id) {
		try {
		Person person=service.searchByKey(id);
		EndView.printSearch(person);
		}catch (Exception e){
			EndView.printMessage(e.getMessage());
		}
		
	}

	/**
	 * ����ϱ�
	 * 
	 * @param
	 */
	public static void insert(Person person) {
		try {
		service.insert(person);
		EndView.printMessage("��ϵǾ����ϴ�...");
		}catch(Exception e){
			EndView.printMessage(e.getMessage());
		}
	}

	/**
	 * key(id)�� �ش��ϴ� ������ ã�Ƽ� ����
	 */
	public static void delete(String id) { 
		try{// key = id
		service.delete(id);
		EndView.printMessage("�����Ǿ����ϴ�");
		}catch(Exception e) {
			EndView.printMessage(e.getMessage());
		}
	}

	/**
	 * �����ϱ�
	 * 
	 * @param : Person or Student
	 */
	public static void update(Person person) {
		try {
		service.update(person);
		EndView.printMessage("�����Ǿ����ϴ�.");
		}catch(Exception e) {
			EndView.printMessage(e.getMessage());
		}
		
	}
}
