package ex0812;
import java.util.*;
class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30);//2030���
		System.out.printf("%d , %d%n",20,30);//20 , 30���
		System.out.println();
		
		
		
	   System.out.printf("���� : %,d��%n",25320000);//%,d 3�ڸ����� ������ֱ�
	   System.out.printf("%5.2f%n",35.33333);//%5.2�Ҽ��� �ؿ����ڸ���������
	 System.out.println();
	 
	 
	 
	 
		 System.out.printf("%d��  %d�� %d��%n",2009,5,3);
		 System.out.printf("%2$d�� %3$d�� %1$d��%n",1, 2005, 3);//int$d�� �μ� ������ġ
		 //$�� �ε����� ���ڸ� �ٲ�

		Calendar now=Calendar.getInstance();//���� �ð��� ��¥ ����
		System.out.println(now);
		
		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) );//�ʱ�� 1���� 0�̴�.����Ҷ��� +1���ش�. 
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
		
		//System.out.println(now);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� : %1$tM�� : %1$tS��%n" , now);
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","������",20);//���ڼ����� ����10�ڸ�
		System.out.printf("%3d %-10s %-8s %-5d%n",122,"hee","��ȿ��",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","������",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","������",20);
		
		
		System.out.printf("%3d %10s %-8s %-5d%n",1,"jang","������",20);//���ڼ����� ����10�ڸ�
		System.out.printf("%3d %10s %-8s %-5d%n",22,"hee","��ȿ��",03);
		System.out.printf("%3d %10s %-8s %-5d%n",3,"rew97","������",20);
		System.out.printf("%3d %10s %-8s %-5d%n",4,"jang","������",20);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� : %1$tM�� : %1$tS��%n" , now);
	}
}
