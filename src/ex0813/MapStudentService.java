package ex0813;

import java.util.Map;
import java.util.TreeMap;

public class MapStudentService {

	Person person = new Person();
	MapStudentController msc = new MapStudentController();

	private Map<String, Person> map = new TreeMap<String, Person>();
	// String id가 key이고, Person 타입이 value다.
	// key 값을 정렬할 수 있는 TreeMap을 이용할 것이다

	/**
	 * map에 Person or Student를 생성해서 저장한다(초기치 데이터 세팅)
	 */
	public MapStudentService() {
		map.put("jang", this.create("jang", "장희정", 20)); // Person
		map.put("kim", this.create("kim", "김희선", 25));
		map.put("girl", this.create("girl", "고소영", 30));

		map.put("king", this.create("king", "송중기", 28, 80, 90, 85)); // Student
		map.put("queen", this.create("queen", "송혜교", 20, 90, 70, 95)); // Student
		map.put("lee", this.create("lee", "이효리", 33, 90, 60, 75)); // Student

	}

	/**
	 * 처음 초기치데이터 설정을 위해 객체를 생성해서 리턴해주는 메소드
	 * 
	 * @return : Person or Student 이기 때문에 Person으로..
	 */

	public Person create(String id, String name, int age, int... param) {
		// int...param 은 매개변수를 여러개 받는 것 (어제 응용)
		// Person일 때(국영수 없을 때), student일 때(국영수 있을 때) 모두 커버 가능

		if (param.length == 0) {// param이 안들어오면 person
			return new Person(id, name, age);
		} else { // param이 들어오면 student
			return new Student(id, name, age, param[0], param[1], param[2]);
		}

	}

	/**
	 * 전체검색하기
	 */

	public Map<String, Person> selectAll() {
		return null;
	}

	/**
	 * key(학생 id)에 해당하는 정보 검색 :key해당하는 정보를 출력할때 [ Person인경우는 이름만 출력 Student인경우는 이름과
	 * 총점 출력 ] -> EndView에서 없는경우는 "id는 없습니다." 예외발생
	 */
	public Person searchByKey(String key) {// student일수도 있고 person일수도 있기 때문에
		// 두가지 모두 리턴 가능한 Person으로
		return null;
	}

	/**
	 * 등록 : key와 Person의 정보를 받아 등록하는 메소드 등록이 실패하면(id중복체크!!) 예외발생시킨다. - throw new
	 * XxxException("key가 중복입니다") ("등록되지 않았습니다.") :예외처리는 던지기 할 것이다 (왜냐면 예외가 발생하면 멈추기
	 * 때문에 던져서 프로그램이 동작하도록) ...메소드 선언부 옆에 throws XxxException{}
	 */
	public void insert(Person person) {// Student or Person

	}

	/**
	 * 삭제 : id에 해당하는 value가 삭제되지 않으면 예외발생 (삭제되지 않았습니다.)
	 */
	public void delete(String id) {

	}

	/**
	 * 수정 만약, Person인경우 - 이름만 수정 Student인경우 - 이름, 국어 ,영어,수학수정(총점 변경)
	 * 
	 * 수정이 안된다면 예외발생
	 * 
	 */
	public void update(Person person) {

	}

}
