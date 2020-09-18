package ex0813.map;

import java.util.Map;

public class MapStudentController {
	private static MapService service = new MapService();

	/**
	 * 전체 검색
	 */
	public static void selectAll() {
		/// service를 호출하고 그 결과를 받아서 EndView호출한다.service는 생성해서 접근해야함.
		try {
		Map<String,Person> map =service.selectAll();
		EndView.printAll(map);
		}catch(Exception e) {
			//예외가 발생했을 때 해야할 일 작성
			EndView.printMessage(e.getMessage());//메세지를 직접작성하는 것이 아니다.예외 발생한 곳에서 작성된 것을 불러옴.
		}
		
	}

	/**
	 * id를 찾아 정보 검색
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
	 * 등록하기
	 * 
	 * @param
	 */
	public static void insert(Person person) {
		try {
		service.insert(person);
		EndView.printMessage("등록되었습니다...");
		}catch(Exception e){
			EndView.printMessage(e.getMessage());
		}
	}

	/**
	 * key(id)에 해당하는 정보를 찾아서 삭제
	 */
	public static void delete(String id) { 
		try{// key = id
		service.delete(id);
		EndView.printMessage("삭제되었습니다");
		}catch(Exception e) {
			EndView.printMessage(e.getMessage());
		}
	}

	/**
	 * 수정하기
	 * 
	 * @param : Person or Student
	 */
	public static void update(Person person) {
		try {
		service.update(person);
		EndView.printMessage("수정되었습니다.");
		}catch(Exception e) {
			EndView.printMessage(e.getMessage());
		}
		
	}
}
