package ex0812;
import java.util.*;
class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30);//2030출력
		System.out.printf("%d , %d%n",20,30);//20 , 30출력
		System.out.println();
		
		
		
	   System.out.printf("가격 : %,d원%n",25320000);//%,d 3자리마다 점찍어주기
	   System.out.printf("%5.2f%n",35.33333);//%5.2소수점 밑에두자리까지보기
	 System.out.println();
	 
	 
	 
	 
		 System.out.printf("%d년  %d월 %d일%n",2009,5,3);
		 System.out.printf("%2$d년 %3$d월 %1$d일%n",1, 2005, 3);//int$d는 인수 숫자위치
		 //$가 인덱스의 숫자를 바꿈

		Calendar now=Calendar.getInstance();//현재 시간과 날짜 설정
		System.out.println(now);
		
		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) );//초기는 1월이 0이다.출력할때는 +1해준다. 
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
		
		//System.out.println(now);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now);
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","장희정",20);//숫자세나리 문자10자리
		System.out.printf("%3d %-10s %-8s %-5d%n",122,"hee","정효욱",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","장희정",20);
		
		
		System.out.printf("%3d %10s %-8s %-5d%n",1,"jang","장희정",20);//숫자세나리 문자10자리
		System.out.printf("%3d %10s %-8s %-5d%n",22,"hee","정효욱",03);
		System.out.printf("%3d %10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %10s %-8s %-5d%n",4,"jang","장희정",20);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now);
	}
}
