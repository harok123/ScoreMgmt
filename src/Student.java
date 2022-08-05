
public class Student {
	private String id, name;
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
	public Student() {	//기본 생성자
		super();
	}
	public Student(String id, String name, int kor, int eng, int mat, int edp) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEdp() {
		return edp;
	}
	public void setEdp(int edp) {
		this.edp = edp;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override //(재정의)
			  //%10s = 오른정렬로 10자리 받겠다.
			  //%-10s = 왼쪽정렬로 10자리 받겠다.
	public String toString() {// 기본은 오른쪽 정렬 // 소수점자리 -> 0.0f
		return String.format("%s %s\t%d\t%d\t%d\t%d\t%d\t%.2f\t%c%n", id,
				name, kor, eng, mat, edp, tot, avg, grade);
	}
	
	
	
}
