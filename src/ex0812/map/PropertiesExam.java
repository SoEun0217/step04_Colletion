package ex0812.map;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesExam {
	Properties pro = new Properties();

	public PropertiesExam() {
		// 저장
		pro.setProperty("id", "jang");
		pro.setProperty("age", "20");
		pro.setProperty("addr", "경기도 판교");
		// 꺼내기
		Set<String> keys = pro.stringPropertyNames();// 모든 key정보 Set으로 가져오기
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}//생성자
	
	/**
	 *외부 ~.properties파일 로딩.
	 *1)IO를 이용해서 properties파일을 로딩
	 *2)ResourceBundle객체를 이용한 로딩.
	 */
	//1)IO를 이용해서 properties파일을 로딩
	public void test1() throws Exception{//test1을 호출한데에서 예외처리해주어야함
		pro.clear();
		pro.load(new FileInputStream("src/ex0812/map/test.properties"));
		//꺼내기
		Set<String> keys = pro.stringPropertyNames();// 모든 key정보 Set으로 가져오기
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
		
		
	}
	
	
	
	/**
	 * /2)ResourceBundle객체를 이용한 로딩.
	 * ResourceBundld 객체는 ~properties파일 로딩하는 전용 클래스
	 * 경로를 지정할 때 확장자는 생략한다.
	 * 기준 폴더가 classes폴더이다.
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
