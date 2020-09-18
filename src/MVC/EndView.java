package MVC;

import java.util.List;

class EndView{
	/**
	��ü���
	��𼭳� ���ٰ����ϰ� �޼ҵ忡 static�� �� �ٿ��ش�. 
	*/

	public static void printAll(List<Electronics> elecArr){
		System.out.println("**********���� ��ǰ ***********");//static�� ���� ����
		for(Electronics e:elecArr) {
			System.out.println(e);
		}
		
	}

	/**
	�𵨹�ȣ�� �ش��ϴ� ��ȣ ���
	*/

	public static void printSearchByModelNo(Electronics electronics){
		System.out.println("��ǰ��ȣ:"+electronics.getModelNo());
		System.out.println("��ǰ�̸�:"+electronics.getModelName());
		System.out.println("��ǰ����:"+electronics.getModelPrice());
		System.out.println("��ǰ����:"+electronics.getModelDetail());

	}

	/**
	�޼��� ���
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}

}