package MVC;
/**
view�� model���̿��� �߰� ������ ���ִ� ������
view���� ������ ��û�� ���� �׿� �ش��ϴ� service�� ȣ���ϰ�
�� ȣ��� ����� �޾� ����������� �����ϴ� ������ �Ѵ�.
*/


class ElectronicsController{
	private ElectronicsService service=new ElectronicsService();
	
	
	/**���*/

	public void insert(Electronics electronics){
		//�𵨹�ȣ�� �ߺ����� üũ�� �� �ߺ��� �ƴϸ� ����Ѵ�.
		//���񽺸� ȣ���ϱ� ���� ���� �ߺ��� ������.
		if(service.searchByModelNo(electronics.getModelNo())!=null){
			EndView.printMessage(electronics.getModelNo()+"�� �ߺ��Դϴ�. ����� �� �����ϴ�.");
			return;
		}


		boolean result=service.insert(electronics);
		if(result==true){//����
			EndView.printMessage("��ϵǾ����ϴ�.");
		
		}else{//����
			EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");

		}
	}
	/**��ü�˻�*/
	/*������
	public void selectAll(){
		Electronics [] elecArr=service.selectAll();
		EndView.printAll(elecArr); 
    }
	
	
	*/



	public void selectAll(){
		service.selectAll();
		EndView.printAll(service.selectAll());
	}
	
	/**�𵨹�ȣ�˻�*/
	public void searchByModelNo(int modelNo){
		Electronics searchModel=service.searchByModelNo(modelNo);
		if(searchModel==null){
			EndView.printMessage(modelNo+"�� �������� �ʴ� ��ȣ�Դϴ�");
			
		}else EndView.printSearchByModelNo(searchModel);

	}
	/**�����ϱ�*/
	public void update(Electronics electronics){
		if(!service.update(electronics)){//����boolean���� ������ ������ �ʿ���� ���� ���� if�ȿ� ������ true�̸� ���� !�տ� ���̸� false����̴�
			EndView.printMessage("�������� �ʴ� ��ȣ�̹Ƿ� �����Ҽ� �����ϴ�.");
		}else EndView.printMessage("�����Ϸ�Ǿ����ϴ�.");


	}


}