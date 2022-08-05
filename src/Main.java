
public class Main {
	public static void main(String[] args) {
		Student ar[] = new Student[100];
		Input input = new Input(ar);
		int count = input.fileInput();
		System.out.println("count = " + count);
		
//		Calc calc = new Calc(ar);
//		calc.calc(count);
//		
//		Sort sort = new Sort(ar,count);
//		sort.bs();
//		
//		Output output = new Output();
//		output.pl();
//		output.Print(ar, count);
//		
		System.out.println("성적관리프로그램 끝");
	}
}
