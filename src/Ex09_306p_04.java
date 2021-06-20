import java.util.Scanner;

public class Ex09_306p_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int first, last;
		
		System.out.printf("문자열 ==> ");
		str = s.nextLine();
		
		first = str.indexOf("Java");
		System.out.printf("제일 처음 나오는 Java 위치 ==> %d\n", first);
		
		last = str.lastIndexOf("Java");
		System.out.printf("마지막에 나오는 Java 위치 ==> %d", last);
		
		
	}

}
