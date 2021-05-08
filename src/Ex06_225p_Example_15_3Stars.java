import java.util.Scanner;

public class Ex06_225p_Example_15_3Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;		//입력받을 문자열 변수를 선언
		int str_cnt;	//입력한 문자의 개수를 저장할 변수를 선언
		int i;			
		
		System.out.printf("글자를 입력 : ");
		str = s.nextLine();		//문자열을 입력받는다.
		
		System.out.printf("\n");
		System.out.printf("입력한 문자열 ==> %s\n", str);
		System.out.printf("변환된 문자열 ==> ");
		
		str_cnt = str.length();		//입력한 문자열의 개수를 계산
		
		for (i = str_cnt-1; i >= 0; i-- ) {				//입력된 개수만큼 거꾸로 한 글자씩 출력한다.
			System.out.printf("%c", str.charAt(i));
		}
			
	}
}

