package ex0811;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list=new ArrayList<Student>();//�������̽�Ÿ�� List���ؾ���
	public StudentService () {
		//list�� �ʱ�ġ ������ 5�� ����
		list.add(new Student("Kim", "�����", 24, "����"));
		list.add(new Student("Lim","�ӳ���",50,"����"));
		list.add(new Student("Salgu","�챸",3,"����"));
		list.add(new Student("Lee","��ȿ��",30,"�뱸"));
	}
	/**
	 * �л��� ����ϱ�
	 * return : true�̸� ��ϼ���,false �̸� ��� ����
	 * 	 * */
	 public boolean insert(Student student) {
		 //�߰����� ���̵� �ߺ�üũ�ϰ� �ߺ��ƴϸ� �߰��Ѵ�.
		 if(this.searchById(student.getId())!=null) {
			 return false;
		 }
		 boolean result=list.add(student);
		 return  result;
	 }
	
	
	/**
	 * ��ü�˻�
	 * */
	 public List<Student> selectAll(){
		 return  list;
		 
	 }
	
	/**
	 * ID�� �ش��ϴ� �л����� �˻�
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
	 * ID�� �ش��ϴ� �л� ����
	 * return : �������� false:��������
	 * */
	public boolean delete(String id) {
		Student st =this.searchById(id);
			
		return list.remove(st);
		
	}
	
	
	

	/**
	 * ID�� �ش��ϴ� �л��� ���̿� �ּ� ����
	 * return true �������� false��������
	 * */
	public boolean update(Student student) {//���̵� ���� �ּҸ� ������ ����.
		Student searchStudent=this.searchById(student.getId());
		if(searchStudent==null)return false;
		searchStudent.setAddr(student.getAddr());
		searchStudent.setAge(student.getAge());
		return true;
	}
	
	
	
}
