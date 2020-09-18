package MVC;

import java.util.ArrayList;
import java.util.List;

/**
������ǰ�� �����ϴ� Ŭ����(���,����,�˻�...)
:�̱��� Ŭ������ �����.
*/

class ElectronicsService{
	private List<Electronics> elecArr=new ArrayList<Electronics>();
	public ElectronicsService() {
		
		elecArr.add(new Electronics(1,"������",35000,"��ǳ ������¯�ÿ�"));
		elecArr.add(new Electronics(2,"������",25000,"������ ¯"));
		elecArr.add(new Electronics(3,"�����",15000,"��ġ����� ��"));
		elecArr.add(new Electronics(4,"��ǳ��",40000,"��ǳ�� ���ƿ�"));
		elecArr.add(new Electronics(5,"������",50000,"����������"));
	}

	/**
	��ü�˻�
	*/
	public List<Electronics>  selectAll(){
		return elecArr;

	}

	/**
	����ϱ�
	return :true�̸� ��ϼ���, false�̸� ��Ͻ���
	*/
	public boolean insert(Electronics electronics){
		
		boolean result=elecArr.add(electronics);
		return result;
	}

	/**
	�𵨳ѹ��� �ش��ϴ� ��ǰ�˻��ϱ�
	*/
	public Electronics searchByModelNo(int modelNo){
		for(Electronics e:elecArr) {
			if(e.getModelNo()==modelNo) {
				return e;
			}
		}
		return null;//���� ���� ã�����ߴ�.
	}


	/**
	�𵨹�ȣ�� �ش��ϴ� ��ǰ �����ϱ�(���� ����)
	return :true�̸� ��������, false�̸� �����Ұ�
	*/
	public boolean update(Electronics electronics){
		Electronics elec=this.searchByModelNo(electronics.getModelNo());

			//ã�Ҵ�.  ->����������
			elec.setModelDetail(electronics.getModelDetail());
			elec.setModelPrice(electronics.getModelPrice());
			return true;

	}


	//public Electronics [] searchByContainedWord(String word){

			
	//}

}//Ŭ������