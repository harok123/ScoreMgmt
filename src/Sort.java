
public class Sort {
	private Student ar[];
	private int count;
	
	public Sort(Student ar[], int count) {
		this.ar=ar;
		this.count=count;
	}
	//private일때는 get을 받는다.
	
	public void bs() {	// 버블소팅 : 자기 자신과 다음꺼 비교 ex) i, i+1 비교 // i 범위와 j의 범위가 같다.
		for (int i = 0; i < count-1; i++) {
			for (int j = 0; j < count-1; j++) {
				if (ar[j].getTot() < ar[j+1].getTot()) {
					swap(j, j+1);
				}
			}
		}
	}
	
	public void ss() {	// 설렉션소팅 : 하나의 기준과 또 다른 기준을 비교. ex) i, j 비교
		for (int i = 0; i < count-1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (ar[i].getTot() < ar[j].getTot()) {
					swap(i, j);
				}
			}
		}
	}
	
	public void swap(int front, int back) {
		Student temp = ar[front];
		ar[front] = ar[back];
		ar[back] = temp;
	}
}
