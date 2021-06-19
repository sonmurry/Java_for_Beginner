import java.util.Scanner;

public class Ex09_305p_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.printf("출력 문자열 ==> ");
		if (str.startsWith("(")==true) {
		}else {
			System.out.printf("(");
		}
		System.out.printf("%s", str);
		
		if (str.endsWith(")")==true) {
		}else {
			System.out.printf(")");
		}
	}

}
