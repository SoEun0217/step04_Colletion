package ex0812.map;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesExam {
	Properties pro = new Properties();

	public PropertiesExam() {
		// ����
		pro.setProperty("id", "jang");
		pro.setProperty("age", "20");
		pro.setProperty("addr", "��⵵ �Ǳ�");
		// ������
		Set<String> keys = pro.stringPropertyNames();// ��� key���� Set���� ��������
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}//������
	
	/**
	 *�ܺ� ~.properties���� �ε�.
	 *1)IO�� �̿��ؼ� properties������ �ε�
	 *2)ResourceBundle��ü�� �̿��� �ε�.
	 */
	//1)IO�� �̿��ؼ� properties������ �ε�
	public void test1() throws Exception{//test1�� ȣ���ѵ����� ����ó�����־����
		pro.clear();
		pro.load(new FileInputStream("src/ex0812/map/test.properties"));
		//������
		Set<String> keys = pro.stringPropertyNames();// ��� key���� Set���� ��������
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
		
		
	}
	
	
	
	/**
	 * /2)ResourceBundle��ü�� �̿��� �ε�.
	 * ResourceBundld ��ü�� ~properties���� �ε��ϴ� ���� Ŭ����
	 * ��θ� ������ �� Ȯ���ڴ� �����Ѵ�.
	 * ���� ������ classes�����̴�.
	 */

	public void test2() {
		ResourceBundle rb=ResourceBundle.getBundle("ex0812/map/test");
		Set<String>keys=rb.keySet();
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=rb.getString(key);
			System.out.println(key+"  : "+value);
		
		
		
		rb.getString(key);
	}
		
		
	}

	public static void main(String[] args)throws Exception {
		PropertiesExam pe=new PropertiesExam();
		System.out.println("------------------");
		//pe.test1();
		System.out.println("------------------");
		pe.test2();
	}

}
