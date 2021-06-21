import java.util.Scanner;

public class Ex09_323p_14 {

	static int calc(int v1, int v2, int op) {
		int result =0;
		
		switch (op) {
		case 1:
			result = v1+v2; break;
		case 2:
			result = v1-v2; break;
		case 3:
			result = v1*v2; break;
		case 4:
			if (v2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
				
			}else 
			result = v1/v2; break;
		default: result =0;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int res;
		int oper, a, b;
		System.out.printf("계산 입력 (1: +, 2: -, 3: *, 4: /) : ");
		oper = s.nextInt();
		
		System.out.printf("첫번째 숫자를 입력 : ");
		a = s.nextInt();
		
		System.out.printf("두번째 숫자를 입력 : ");
		b = s.nextInt();
		
		res = calc(a, b, oper);
		
		System.out.printf("계산 결과는 : %d\n", res);
		
	}

}
