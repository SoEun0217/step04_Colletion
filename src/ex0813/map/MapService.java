package ex0813.map;

import java.util.Map;
import java.util.TreeMap;

public class MapService {
	
	private Map<String, Person> map = new TreeMap<String, Person>();
	

	public MapService() {
		map.put("jang", this.create("jang","장희정", 20));
		map.put("jean", create("jean","장발장",45));
		map.put("kim", create("kim","카다시안",40));

		map.put("jonny", create("jonny","Jonney depp",50,14,100,50));
		map.put("keanu", this.create("keanu","keanu reves",10000,100,100,100));
		map.put("kazano", this.create("kazano","효리",16,85,79,86));
		
	}
	
	/**
	 * 처음 초기치 데이터 설정을 위햐 객체를 생성해서 리턴해주는 메소드
	 * @return : Person or Student
	 */
	public Person create(String id, String name, int age, int... param) {//variableArgument사용
		if(param.length==0)
			return new Person(id,name,age);
		else return new Student(id,name,age,param[0],param[1],param[2]);
	}
	
	/**
	 * 전체 검색하기
	 */
	public Map<String, Person> selectAll()throws Exception{
		if(map.isEmpty()) {
			//throw new RuntimeException("검색된 정보가 없습니다");//비체크 Exception
			throw new Exception("검색된 정보가 없습니다.^^");
			
		}
		return map;
	}
	
	/**
	 * 	key에 해당하는 정보 검색
	 *   	:key해당하는 정보를 출력할때 Person인경우는 이름만 출력
	 *		 Student인경우는 이름과 총점 출력 -> EndView에서 
	 *    	 없는경우는 "id는 없습니다." 예외발생
	 * */
	public Person searchByKey(String key) throws Exception{
		Person person=map.get(key);
		if(person==null){
			throw new Exception(key+"에 해당하는 정보는 없습니다.");
		}
		return person;	
	}
	
	/**
	 * 등록 : key와 Person의 정보를 받아 등록하는 메소드
	 *        등록이 실패하면(id중복체크!!) '예외발생시킨다.' throw new xxxException ("등록되지 않았습니다.")
	 *        예외처리는 던지기로
	 * */
	public void insert  (Person person) throws Exception{
		if(map.containsKey(person.getId())) {
			throw new Exception(person.getId()+"는 중복이므로 등록되지 않았습니다.");//만약에 중복체크 안하면 키가 같을때
		}                                                                            //덮어써버림
		map.put(person.getId(),person);
		
	}
	
	/**
	 *  삭제
	 *   : id에 해당하는 value가 삭제되지 않으면 예외발생
	 *      (삭제되지 않았습니다.)
	 * */
	public void delete(String id) throws Exception{
		//remove메소드의 리턴값은 삭제가 되면 삭제된 객체를 리턴
		//삭제되지 않으면  null을 리턴한다.
		Person person=map.remove(map.get(id));
		if(person==null) {
			throw new Exception(id+"에 해당하는 정보가 없어 삭제할 수 없습니다.");
		}
		
//		Person person=map.get(id);
//		if(person==null) {
//			throw new Exception("삭제되지 않았습니다.");
//		}
//		map.remove(id);
		
		
		
	}
	
	/**
	 * 수정
	 *   만약, Person인경우 - 이름만 수정
	 *         Student인경우  - 이름, 국어 ,영어,수학수정(총점 변경)
	 *         
	 *    수정이 안된다면 예외발생
	 *    
	 * */
	public void update(Person person) throws Exception{//Person or Student
//		if(map.containsKey(person.getId())) {
//			if(person instanceof Student) {
//			
//				Student student=(Student)person;
//				student.setKor(student.getKor());
//				student.setEng(student.getEng());
//				student.setMath(student.getMath());
//			}else if(!person instanceof Student)
//			person.setName(person.getName());{
//		}
//		
//		throw new Exception(person.getId()+"는 존재하지 않으므로 수정할 수 없습니다.");	
		
		Person savePerson=map.get(person.getId());
		if(savePerson==null) {
			throw new Exception(person.getId()+"는 존재하지 않으므로 수정할 수 없습니다.");	
		}
		
		if(person instanceof Student) {//변경하려는 정보가 학생인 경우...
			if(savePerson instanceof Student) {
				savePerson.setName(person.getName());
				Student dataStudent=(Student)person;
				Student updateStudent=(Student)savePerson;
				
				updateStudent.setEng(dataStudent.getEng());
				updateStudent.setKor(dataStudent.getKor());
				updateStudent.setMath(dataStudent.getMath());
				//총점
				int sum=updateStudent.getKor()+updateStudent.getEng()+updateStudent.getMath();                                                                        
				updateStudent.setSum(sum);
				
				
			}else {
				throw new Exception("타입 오류로 수정할 수 없습니다.");
			}
		}else {//변경하려는 정보가 Person인 경우
			savePerson.setName(person.getName());
		}
		
		
	}
}

