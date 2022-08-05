import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	private Student ar[];
	private Scanner sc;
	private File file;
	private BufferedReader br;
	
//	public Input(Student ar[]) {
//		this.ar = ar;
//		this.sc = new Scanner(System.in);
//	}
	
	//file -> java api 참고
	public Input(Student ar[]) {
		this.ar = ar;
		this.file = new File("C:/Temp/sungjuk_utf8.dat");
		try {
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}	
	}

	public int fileInput() {
		int count = 0;
		String line = null;	//다음라인이 없다.
		while (true) {
			count++;
			try {
				line=this.br.readLine();	//readline => 한줄씩 읽는것.
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (line== null) 
				break;
			{
				String lines[] = line.split("\\s+");
				System.out.println(lines[1]);
			}	//if문을 받으면 바로 빠진다. ↓
			
		}
		return count-1;
	} 
	
//	public int input() {
//		String io = null;
//		int count = 0;
//		
//		do {
//			count++;
//			
//			System.out.println("id: ");
//			String id = sc.nextLine();
//		
//			System.out.println("name: ");
//			String name = sc.nextLine();
//			
//			System.out.println("kor: ");
//			int kor = sc.nextInt();
//			System.out.println("eng: ");
//			int eng = sc.nextInt();
//			System.out.println("mat: ");
//			int mat = sc.nextInt();
//			System.out.println("edps: ");
//			int edps = sc.nextInt();
//			sc.nextLine();	//buffer 날리기
//			
//			ar[count-1] = new Student(id, name, kor, eng, mat, edps);
//			
//			System.out.print("계속(I/O) ? : ");
//			io = this.sc.next();
//		} while (io.equals("I") || io.equals("i"));
//		
//		return count;	//몇번 돌았는지
//	}
}
