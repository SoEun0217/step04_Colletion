package Map;

public class Student extends Person {
	private int kor;
	private int eng;
	private int math;
	private int sum;

	public Student(String id, String name, int kor, int eng, int math, int sum) {
		this(id, name, kor, eng, math);
		this.sum = sum;
	}

	public Student(String id, String name, int kor, int eng, int math) {
		super(id, name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}
}
