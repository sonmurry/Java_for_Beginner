import java.util.Scanner;

public class Ex09_339p_Example24_3Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String in, out = "";
		char ch;
		int count, i;
		int diff = 'a'- 'A';
		
		System.out.printf("문자열을 입력하세요 : ");
		in = s.nextLine();
		
		System.out.printf("변환된 문자열 ==> ");
		
		count = in.length();
		
		for (i = 0; i < count ; i++) {
			ch = in.charAt(i);
			if ('a' <= ch && ch <='z') {
				out += (char) (ch-diff) ;
			}else if ('A' <= ch && ch <='Z') {
				out += (char) (ch+diff) ;
			}else
				out += ch;
			
		}
		System.out.printf("%s", out);
	}

}
