package MVC;
/**
������ǰ�� �Ӽ��� �����ϴ� ��ü(�𵨹�ȣ,���̸�,����,����)
*/


class Electronics{
	private int modelNo;//��ȣ
	private String modelName;//�̸�
	private int modelPrice;//����
	private String modelDetail;//����

	//�����͸� �ʱ�ȭ�ϱ� ���� ������ �ۼ�
	//�����ڳ��� ȣ���� �� - �����ſ��� ������ ȣ���Ѵ�.

	public Electronics(){}

	public Electronics(int modelNo,String modelName,int modelPrice,String modelDetail){
		this(modelNo,modelPrice,modelDetail);
		this.modelName=modelName;
		
	}


	/**
	������ �� �ʿ��� ������(�𵨹�ȣ, �𵨼���)
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
		sb.append("�𵨹�ȣ : ");
		sb.append(modelNo);
		sb.append("���̸� : ");
		sb.append(modelName);
		sb.append("�𵨰��� : ");
		sb.append(modelPrice);
		sb.append("�𵨼��� : ");
		sb.append(modelDetail);
		
		return sb.toString();
	}
	


}