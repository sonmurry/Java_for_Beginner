import java.util.Scanner;

public class Ex08_264p_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		int hap;
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		a = s.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : ");
		b = s.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : ");
		c = s.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : ");
		d = s.nextInt();
		
		s.close();
		
		hap = a+b+c+d;
		
		System.out.printf("합계 ==> %d",hap);
	}

}
