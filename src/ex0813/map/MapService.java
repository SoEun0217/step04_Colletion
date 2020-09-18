package ex0813.map;

import java.util.Map;
import java.util.TreeMap;

public class MapService {
	
	private Map<String, Person> map = new TreeMap<String, Person>();
	

	public MapService() {
		map.put("jang", this.create("jang","������", 20));
		map.put("jean", create("jean","�����",45));
		map.put("kim", create("kim","ī�ٽþ�",40));

		map.put("jonny", create("jonny","Jonney depp",50,14,100,50));
		map.put("keanu", this.create("keanu","keanu reves",10000,100,100,100));
		map.put("kazano", this.create("kazano","ȿ��",16,85,79,86));
		
	}
	
	/**
	 * ó�� �ʱ�ġ ������ ������ ���� ��ü�� �����ؼ� �������ִ� �޼ҵ�
	 * @return : Person or Student
	 */
	public Person create(String id, String name, int age, int... param) {//variableArgument���
		if(param.length==0)
			return new Person(id,name,age);
		else return new Student(id,name,age,param[0],param[1],param[2]);
	}
	
	/**
	 * ��ü �˻��ϱ�
	 */
	public Map<String, Person> selectAll()throws Exception{
		if(map.isEmpty()) {
			//throw new RuntimeException("�˻��� ������ �����ϴ�");//��üũ Exception
			throw new Exception("�˻��� ������ �����ϴ�.^^");
			
		}
		return map;
	}
	
	/**
	 * 	key�� �ش��ϴ� ���� �˻�
	 *   	:key�ش��ϴ� ������ ����Ҷ� Person�ΰ��� �̸��� ���
	 *		 Student�ΰ��� �̸��� ���� ��� -> EndView���� 
	 *    	 ���°��� "id�� �����ϴ�." ���ܹ߻�
	 * */
	public Person searchByKey(String key) throws Exception{
		Person person=map.get(key);
		if(person==null){
			throw new Exception(key+"�� �ش��ϴ� ������ �����ϴ�.");
		}
		return person;	
	}
	
	/**
	 * ��� : key�� Person�� ������ �޾� ����ϴ� �޼ҵ�
	 *        ����� �����ϸ�(id�ߺ�üũ!!) '���ܹ߻���Ų��.' throw new xxxException ("��ϵ��� �ʾҽ��ϴ�.")
	 *        ����ó���� �������
	 * */
	public void insert  (Person person) throws Exception{
		if(map.containsKey(person.getId())) {
			throw new Exception(person.getId()+"�� �ߺ��̹Ƿ� ��ϵ��� �ʾҽ��ϴ�.");//���࿡ �ߺ�üũ ���ϸ� Ű�� ������
		}                                                                            //��������
		map.put(person.getId(),person);
		
	}
	
	/**
	 *  ����
	 *   : id�� �ش��ϴ� value�� �������� ������ ���ܹ߻�
	 *      (�������� �ʾҽ��ϴ�.)
	 * */
	public void delete(String id) throws Exception{
		//remove�޼ҵ��� ���ϰ��� ������ �Ǹ� ������ ��ü�� ����
		//�������� ������  null�� �����Ѵ�.
		Person person=map.remove(map.get(id));
		if(person==null) {
			throw new Exception(id+"�� �ش��ϴ� ������ ���� ������ �� �����ϴ�.");
		}
		
//		Person person=map.get(id);
//		if(person==null) {
//			throw new Exception("�������� �ʾҽ��ϴ�.");
//		}
//		map.remove(id);
		
		
		
	}
	
	/**
	 * ����
	 *   ����, Person�ΰ�� - �̸��� ����
	 *         Student�ΰ��  - �̸�, ���� ,����,���м���(���� ����)
	 *         
	 *    ������ �ȵȴٸ� ���ܹ߻�
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
//		throw new Exception(person.getId()+"�� �������� �����Ƿ� ������ �� �����ϴ�.");	
		
		Person savePerson=map.get(person.getId());
		if(savePerson==null) {
			throw new Exception(person.getId()+"�� �������� �����Ƿ� ������ �� �����ϴ�.");	
		}
		
		if(person instanceof Student) {//�����Ϸ��� ������ �л��� ���...
			if(savePerson instanceof Student) {
				savePerson.setName(person.getName());
				Student dataStudent=(Student)person;
				Student updateStudent=(Student)savePerson;
				
				updateStudent.setEng(dataStudent.getEng());
				updateStudent.setKor(dataStudent.getKor());
				updateStudent.setMath(dataStudent.getMath());
				//����
				int sum=updateStudent.getKor()+updateStudent.getEng()+updateStudent.getMath();                                                                        
				updateStudent.setSum(sum);
				
				
			}else {
				throw new Exception("Ÿ�� ������ ������ �� �����ϴ�.");
			}
		}else {//�����Ϸ��� ������ Person�� ���
			savePerson.setName(person.getName());
		}
		
		
	}
}

