package MVC;
/**
view와 model사이에서 중간 역할을 해주는 것으로
view에서 들어오는 요청을 받을 그에 해당하는 service를 호출하고
그 호출된 결과를 받아 결과뷰쪽으로 전달하는 역할을 한다.
*/


class ElectronicsController{
	private ElectronicsService service=new ElectronicsService();
	
	
	/**등록*/

	public void insert(Electronics electronics){
		//모델번호가 중복인지 체크한 후 중복이 아니면 등록한다.
		//서비스를 호출하기 전에 먼저 중복을 해주자.
		if(service.searchByModelNo(electronics.getModelNo())!=null){
			EndView.printMessage(electronics.getModelNo()+"는 중복입니다. 등록할 수 없습니다.");
			return;
		}


		boolean result=service.insert(electronics);
		if(result==true){//성공
			EndView.printMessage("등록되었습니다.");
		
		}else{//실패
			EndView.printMessage("등록되지 않았습니다.");

		}
	}
	/**전체검색*/
	/*교수님
	public void selectAll(){
		Electronics [] elecArr=service.selectAll();
		EndView.printAll(elecArr); 
    }
	
	
	*/



	public void selectAll(){
		service.selectAll();
		EndView.printAll(service.selectAll());
	}
	
	/**모델번호검색*/
	public void searchByModelNo(int modelNo){
		Electronics searchModel=service.searchByModelNo(modelNo);
		if(searchModel==null){
			EndView.printMessage(modelNo+"는 존재하지 않는 번호입니다");
			
		}else EndView.printSearchByModelNo(searchModel);

	}
	/**수정하기*/
	public void update(Electronics electronics){
		if(!service.update(electronics)){//굳이boolean형을 변수로 저장할 필요없이 비교할 것을 if안에 넣으면 true이면 으로 !앞에 붙이면 false라면이다
			EndView.printMessage("존재하지 않는 번호이므로 수정할수 없습니다.");
		}else EndView.printMessage("수정완료되었습니다.");


	}


}