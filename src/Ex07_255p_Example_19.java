import java.util.Scanner;

public class Ex07_255p_Example_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;		//문자열 변수
		char ch;		//문자형 변수
		int i, k;		//반복문에서 사용할 정수형 변수
		int star;		//별의 개수를 추출할 때 쓰일 정수형 변수
		
		int given;
		
		
		System.out.print("숫자를 여러 개 입력 : ");
		str = s.nextLine();		//입력받은 숫자를 문자열로 입력받는다.
		
		i = 0; 		//문자열의 위치를 나타낼 변수
		ch = str.charAt(i);		//문자열에서 한 글자(숫자)를 추출한다(첫 번째 숫자)
		while (true) {
			star = (int)ch -48; 	//받은 문자열의 i번째 숫자(문자형)를 정수형으로 캐스팅, 예를들어 5의 아스키값이 53이므로 5로 만들기 위해 -48을 한다.
			
			for ( k = 0; k < star; k++)
				System.out.print("*");		//별의 개수만큼 *을 출력한다.
			System.out.print("\n");
			
			if (++i> str.length()-1) 		//먼저 i를 증가시킨 후 문자열길이 -1보다 크면 while문을 종료한다.
				break;
			ch = str.charAt(i);			//문자열에서 한 글자(숫자)를 추출한다.
			
		}
	}

}
