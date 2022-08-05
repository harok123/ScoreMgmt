
public class Calc {
	private Student ar[];

	public Calc(Student ar[]) {
		this.ar = ar;
	}

	public void calc(int count) {	//count만큼 돌거니깐 for문을 쓴다.
		for (int i = 0; i < count; i++) {
			Student std = ar[i];
			//	private라 접근이 안되니깐 get을 써서 값을 받는다.
			int tot = calcTotal(std.getKor(), std.getEng(), std.getMat(), std.getEdp());
			double avg = calcAvg(tot, 4);
			char grade = calcGrade(avg);
			std.setTot(tot);
			std.setAvg(avg);
			std.setGrade(grade);
		}
	}

	// 메소드는 경우에 따라 private 사용 가능.
	
	private int calcTotal(int kor, int eng, int mat, int edp) {	//성적 총합
		return kor + eng + mat + edp;
	}
	
	private double calcAvg(int tot, int su) {	//평균
		return tot / (double)su;
	}
	
	private char calcGrade(double avg) {	//성적 급수
		return (avg >=90 && avg <=100) ? 'A' :
					(avg >= 80) ? 'B' :
						(avg >= 70) ? 'C' :
							(avg >= 60) ? 'D':'F';
	}
}
