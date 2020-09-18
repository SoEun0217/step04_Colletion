package MVC;

import java.util.ArrayList;
import java.util.List;

/**
전자제품을 관리하는 클래스(등록,수정,검색...)
:싱글톤 클래스로 만든다.
*/

class ElectronicsService{
	private List<Electronics> elecArr=new ArrayList<Electronics>();
	public ElectronicsService() {
		
		elecArr.add(new Electronics(1,"에어컨",35000,"무풍 에어컨짱시원"));
		elecArr.add(new Electronics(2,"제습기",25000,"제습기 짱"));
		elecArr.add(new Electronics(3,"냉장고",15000,"김치냉장고 굿"));
		elecArr.add(new Electronics(4,"선풍기",40000,"선풍기 좋아요"));
		elecArr.add(new Electronics(5,"건조기",50000,"빨래걱정끝"));
	}

	/**
	전체검색
	*/
	public List<Electronics>  selectAll(){
		return elecArr;

	}

	/**
	등록하기
	return :true이면 등록성공, false이면 등록실패
	*/
	public boolean insert(Electronics electronics){
		
		boolean result=elecArr.add(electronics);
		return result;
	}

	/**
	모델넘버에 해당하는 제품검색하기
	*/
	public Electronics searchByModelNo(int modelNo){
		for(Electronics e:elecArr) {
			if(e.getModelNo()==modelNo) {
				return e;
			}
		}
		return null;//같은 것을 찾지못했다.
	}


	/**
	모델번호에 해당하는 제품 수정하기(설명만 수정)
	return :true이면 수정성공, false이면 수정불가
	*/
	public boolean update(Electronics electronics){
		Electronics elec=this.searchByModelNo(electronics.getModelNo());

			//찾았다.  ->수정해주자
			elec.setModelDetail(electronics.getModelDetail());
			elec.setModelPrice(electronics.getModelPrice());
			return true;

	}


	//public Electronics [] searchByContainedWord(String word){

			
	//}

}//클래스끝