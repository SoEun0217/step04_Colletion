package ex0811;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		// 1.등록
		boolean re = service.insert(new Student("aa", "김소은", 24, "서울"));
		System.out.println("등록결과 : re=" + re);
		re = service.insert(new Student("bb", "김소은", 24, "서울"));
		System.out.println("등록결과 : re=" + re);
		re = service.insert(new Student("cc", "김소은", 24, "서울"));
		System.out.println("등록결과 : re=" + re);

		// 2.전체검색
		List<Student> list = service.selectAll();
		System.out.println(list.size() + "명");
		for (Student st : list) {
			System.out.println(st);
		}
		// 3.id에 해당하는 정보 검색
		System.out.println("3.id에 해당하는 정보 검색");
		Student student = service.searchById("vsvs");
		if (student == null)
			System.out.println("정보가 없습니다..");
		else
			System.out.println("검색된 학생 \n" + student);

		// 4.id에 해당하는 레코드 삭제
		if (service.delete("aa")) {
			System.out.println("삭제 되었습니다.");
		} else
			System.out.println("삭제가 되지 않았습니다.");

		System.out.println("레코드 삭제 후");
		list = service.selectAll();// 리스트 그대로 재사용이므로 타입을 다시 선언하지않는다.
		System.out.println(list.size() + "명");
		for (Student st : list) {
			System.out.println(st);
		}

		// 5.id에 해당하는 정보 수정
		System.out.println("5.id에 해당하는 정보 수정");
		re = service.update(new Student("Salgu", 5, "살구집"));// id,age,addr을 설정-수정하고자하는 아이디와 수정값
		if (re)
			System.out.println("수정완료");
		else
			System.out.println("수정불가");
		list = service.selectAll();// 리스트 그대로 재사용이므로 타입을 다시 선언하지않는다.
		System.out.println(list.size() + "명");
		for (Student st : list) {
			System.out.println(st);
		}

	}
}
