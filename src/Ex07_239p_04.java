import java.io.IOException;
import java.util.Scanner;

public class Ex07_239p_04 {

	public static void main(String[] args) throws IOException { // throws IOException은 System.in.read();를 사용하기 위한 필수 사항이다.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b;
		char ch;
		
		while (true) {
			System.out.print("첫 번째 계산할 수를 입력하시오 : ");
			a = s.nextInt();
			System.out.print("두 번째 계산할 수를 입력하시오 : ");
			b = s.nextInt();
			System.out.print("계산할 연산자를 입력하시오 : ");
			ch = (char)System.in.read();		//연산자를 문자형으로 입력받는다.
			
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d \n", a, b, a+b); break;
			case '-':
				System.out.printf("%d - %d = %d \n", a, b, a-b); break;
			case '*':
				System.out.printf("%d * %d = %d \n", a, b, a*b); break;
			case '/':
				System.out.printf("%d / %d = %d \n", a, b, a/b); break;
			case '%':
				System.out.printf("%d %% %d = %d \n", a, b,a%b); break;
			default:
				System.out.print("연산자를 잘못 입력했습니다. \n");		//지정된 연산자 외의 것을 입력했을 때 오류 메시지를 보내기 위함
			}
			
		}
		
	}

}
