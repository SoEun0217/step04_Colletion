package ex0812.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	Map<Integer, String> map = new HashMap<Integer, String>();
	// Map<Integer, String>map=new TreeMap<Integer,String>();//key값이 정렬이 된다.

	/**
	 * map에 데이터 추가
	 */
	public void addMap() {
		map.put(10, "송중기");
		map.put(50, "김소은");
		map.put(40, "김다정");
		map.put(20, "박동주");
		map.put(30, "박기랑");
		map.put(40, "이주원");
		map.put(70, "김도훈");// key가 중복되면 추가가안되는지 덮어쓰기가 되는지?->덮어쓰기가 된다!교체가 된다.
	}

	/**
	 * map에 있는 데이터 꺼내기
	 */
	public void printMap() {
		System.out.println("개수 : " + map.size());
		System.out.println(map);

		// map에 있는 모든 key의 정보를 가져오기
		Set<Integer> kset = map.keySet();
		Iterator<Integer> it = kset.iterator();
		while (it.hasNext()) {// 다음요소가 존재한다면
			Integer key = it.next();
			// key에 해당하는 value 가져오기
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println("keySet()을 개선된 for문으로 변경해보기");
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}

		System.out.println("-------------------------------");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		System.out.println("entrySet()을 개선된 for문으로 변경해보기");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {// Entry나 Set쓸 때 <generic>까먹지 말기!아니면오류남!!!!
			// 정확하게 Map.Entry로 써주세요
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}
	}

	/**
	 * key에 해당하는 value검색하기 있으면 "key의 이름은 ~입니다." 없으면 "key는 존쟇지 않습니다.."
	 */

	public void searchByKey(Integer key) {// key를 알고 있기 때문에 for문이 필요없어요

		/** containsKey메소드 사용하기...
		if (map.containsKey(key)) {
			String value = map.get(key);
			System.out.println(key + "의 이름은 " + value + "입니다.");
		} else
			System.out.println(key + "는 존재하지 않습니다.");
		
		*/
		String value=map.get(key);
		if(value==null) {
			System.out.println(key + "는 존재하지 않습니다.");
		}else {
			System.out.println(key + "의 이름은 " + value + "입니다.");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.addMap();
		me.printMap();
		me.searchByKey(10);

	}

}
