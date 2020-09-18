package ex0811;

import java.util.ArrayList;
import java.util.Collections;

public class Lotto extends ArrayList<Integer> {
	public Lotto() {
		super(6);
	}

	public void createNo() {
		while(size()<6) {
			Integer no = new Integer((int)( Math.random() * 45 + 1));
			if (super.contains(no) == false) {
				super.add(no);

			}
		}
	}

	public void sortArray() {
		Collections.sort(this);
	}

	public void printLotto() {
		for (Integer no : this) {
			System.out.print(no+"\t");
		}
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.createNo();
		lotto.sortArray();
		lotto.printLotto();
	}

}
