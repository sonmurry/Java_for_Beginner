import java.util.Scanner;

public class Ex09_337p_Example_23_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1;
		int i = 0;
		int num;
		
		System.out.printf("문자열을 입력하세요 : ");
		str1 = s.nextLine();
		
		System.out.printf("내용을 거꾸로 출력 ==> ");
		
		num = str1.length();
		while ( i < str1.length() ) {
			System.out.printf("%c", str1.charAt(str1.length()-1-i));
			i++;	
		}
	}

}
