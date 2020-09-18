package MVC;
/**
전자제품의 속성을 관리하는 객체(모델번호,모델이름,가격,설명)
*/


class Electronics{
	private int modelNo;//번호
	private String modelName;//이름
	private int modelPrice;//가격
	private String modelDetail;//설명

	//데이터를 초기화하기 위한 생성자 작성
	//생성자끼리 호출할 때 - 많은거에서 작은걸 호출한다.

	public Electronics(){}

	public Electronics(int modelNo,String modelName,int modelPrice,String modelDetail){
		this(modelNo,modelPrice,modelDetail);
		this.modelName=modelName;
		
	}


	/**
	수정할 때 필요한 생성자(모델번호, 모델설명)
	*/
	public Electronics(int modelNo,int modelPrice,String modelDetail){
		this.modelNo=modelNo;
		this.modelPrice=modelPrice;
		this.modelDetail=modelDetail;
	}

	public void setModelNo(int modelNo){
		this.modelNo=modelNo;
	}

	public void setModelName(String modelName){
		this.modelName=modelName;
	}

	public void setModelPrice(int modelPrice){
		this.modelPrice=modelPrice;
	}

	public void setModelDetail(String modelDetail){
		this.modelDetail=modelDetail;
	}

	public int getModelNo(){
		return modelNo;
	}

	public String getModelName(){
		return modelName;
	}

	public int getModelPrice(){
		return modelPrice;
	}

	public String getModelDetail(){
		return modelDetail;	
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("모델번호 : ");
		sb.append(modelNo);
		sb.append("모델이름 : ");
		sb.append(modelName);
		sb.append("모델가격 : ");
		sb.append(modelPrice);
		sb.append("모델설명 : ");
		sb.append(modelDetail);
		
		return sb.toString();
	}
	


}