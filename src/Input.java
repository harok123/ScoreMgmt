import java.util.Scanner;

public class Input {
	private Student ar[];
	private Scanner sc;
	
	public Input(Student ar[]) {
		this.ar = ar;
		this.sc = new Scanner(System.in);
	}
	
	public int input() {
		String io = null;
		int count = 0;
		
		do {
			count++;
			
			System.out.println("id: ");
			String id = sc.nextLine();
		
			System.out.println("name: ");
			String name = sc.nextLine();
			
			System.out.println("kor: ");
			int kor = sc.nextInt();
			System.out.println("eng: ");
			int eng = sc.nextInt();
			System.out.println("mat: ");
			int mat = sc.nextInt();
			System.out.println("edps: ");
			int edps = sc.nextInt();
			sc.nextLine();	//buffer 날리기
			
			ar[count-1] = new Student(id, name, kor, eng, mat, edps);
			
			System.out.print("계속(I/O) ? : ");
			io = this.sc.next();
		} while (io.equals("I") || io.equals("i"));
		
		return count;	//몇번 돌았는지
	}

}
