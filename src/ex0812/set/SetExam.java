package ex0812.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	//Set <String> set=new HashSet<String>();
	Set <String> set=new TreeSet<String>();//����������
	
	/**
	 * Set�� ������ �߰��ϱ�
	 * */
	public void addSet(String [] args) {
		for(String s:args) {
			boolean result=set.add(s);
			//System.out.println(s+" �߰���� : "+result);
			System.out.printf("%s �߰��� ��� : %b%n",s,result);
		}
		System.out.println("���� : "+set.size());
	}
	
	/**
	 * Set�� ������ ����ϱ�
	 * */
	public void printSet() {
		System.out.println("����ϱ�");
		System.out.println(set);//���� ������� �� ����.
		
		//set�� �ִ� �����͸� �ݺ���(Iterator)�� ���� ��������~
		TreeSet<String>treeSet=(TreeSet<String>)set;
		Iterator<String>it=treeSet.descendingIterator();//��������~TreeSet������ �����ؿ�
		
		//Iterator<String>it=set.iterator();
		while(it.hasNext()) {//���� ��Ұ� �����Ѵٸ�
			String s=it.next();//������Ҹ� ������.
			System.out.println(s);
		}
		//������ for���� ������ Iterator�� ����ϴ� ���̴�.
		System.out.println("������ for��--------------------");
		for(String s:set) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		SetExam se=new SetExam();
		se.addSet(args);
		se.printSet();
	}

}
