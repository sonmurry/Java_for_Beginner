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
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
				
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
		System.out.printf("��� �Է� (1: +, 2: -, 3: *, 4: /) : ");
		oper = s.nextInt();
		
		System.out.printf("ù��° ���ڸ� �Է� : ");
		a = s.nextInt();
		
		System.out.printf("�ι�° ���ڸ� �Է� : ");
		b = s.nextInt();
		
		res = calc(a, b, oper);
		
		System.out.printf("��� ����� : %d\n", res);
		
	}

}
