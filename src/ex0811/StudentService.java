package ex0811;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list=new ArrayList<Student>();//인터페이스타입 List로해야함
	public StudentService () {
		//list에 초기치 데이터 5개 세팅
		list.add(new Student("Kim", "김소은", 24, "서울"));
		list.add(new Student("Lim","임나영",50,"서울"));
		list.add(new Student("Salgu","살구",3,"서울"));
		list.add(new Student("Lee","이효리",30,"대구"));
	}
	/**
	 * 학생을 등록하기
	 * return : true이면 등록성공,false 이면 등록 실패
	 * 	 * */
	 public boolean insert(Student student) {
		 //추가전에 아이디 중복체크하고 중복아니면 추가한다.
		 if(this.searchById(student.getId())!=null) {
			 return false;
		 }
		 boolean result=list.add(student);
		 return  result;
	 }
	
	
	/**
	 * 전체검색
	 * */
	 public List<Student> selectAll(){
		 return  list;
		 
	 }
	
	/**
	 * ID에 해당하는 학생정보 검색
	 * */
	
	public Student searchById(String id) {
		/*for(int i=0;i<list.size();i++) {
			Student st=list.get(i);
			if(st.getId().equals(id)) {
				*/
		for(Student st:list) {
			if(st.getId().equals(id)) {
				return st;
			}
		}
		return null;
		
	}
	
	
	
	/**
	 * ID에 해당하는 학생 삭제
	 * return : 성공삭제 false:삭제실패
	 * */
	public boolean delete(String id) {
		Student st =this.searchById(id);
			
		return list.remove(st);
		
	}
	
	
	

	/**
	 * ID에 해당하는 학생의 나이와 주소 변경
	 * return true 수정성공 false수정실패
	 * */
	public boolean update(Student student) {//아이디 나이 주소를 가지고 있음.
		Student searchStudent=this.searchById(student.getId());
		if(searchStudent==null)return false;
		searchStudent.setAddr(student.getAddr());
		searchStudent.setAge(student.getAge());
		return true;
	}
	
	
	
}
