import java.util.Scanner;

public class Ex09_337p_Example_24_3Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str1;
		

		System.out.printf("문자열을 입력하세요 : ");
		str1 = s.nextLine();
		System.out.printf("변환된 문자열 ==> ");
		
		for (int i = 0; i < str1.length(); i++) {
			if ( 'a' <= str1.charAt(i) && str1.charAt(i) <='z' ) {
				
				System.out.printf("%c", (str1.charAt(i)-32));
			}else if  ( 'A' <= str1.charAt(i) && str1.charAt(i) <='Z' ) {
				
				System.out.printf("%c", (str1.charAt(i)+32));
			}else {
				System.out.printf("%c", str1.charAt(i));
			}
		}
		
		
	}

}
