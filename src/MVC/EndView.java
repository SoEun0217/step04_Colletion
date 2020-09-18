package MVC;

import java.util.List;

class EndView{
	/**
	전체출력
	어디서나 접근가능하게 메소드에 static을 다 붙여준다. 
	*/

	public static void printAll(List<Electronics> elecArr){
		System.out.println("**********전자 제품 ***********");//static이 붙은 이유
		for(Electronics e:elecArr) {
			System.out.println(e);
		}
		
	}

	/**
	모델번호에 해당하는 번호 출력
	*/

	public static void printSearchByModelNo(Electronics electronics){
		System.out.println("제품번호:"+electronics.getModelNo());
		System.out.println("제품이름:"+electronics.getModelName());
		System.out.println("제품가격:"+electronics.getModelPrice());
		System.out.println("제품설명:"+electronics.getModelDetail());

	}

	/**
	메세지 출력
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}

}