import java.util.Scanner;

public class Ex09_314p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int coffee;
		
		System.out.printf("� Ŀ�Ǹ� �帱���? (1:����, 2:����, 3:��)  ");
		coffee = s.nextInt();
		
		System.out.printf("\n# 1. �߰ſ� ���� �غ��Ѵ�");
		System.out.printf("\n# 2. �������� �غ��Ѵ�");
		switch (coffee) {
		case 1:
			System.out.printf("\n# 3. ����Ŀ�Ǹ� ź�� ");
			break;
		case 2:
			System.out.printf("\n# 3. ����Ŀ�Ǹ� ź�� ");
			break;
		case 3:
			System.out.printf("\n# 3. ��Ŀ�Ǹ� ź�� ");
			break;
		default:
			System.out.printf("\n�ƹ��ų� ź��"); break;
		}
		System.out.printf("\n# 4. ���� �״´�");
		System.out.printf("\n# 5. ��Ǭ���� ��� ���δ� \n");
	
		
		System.out.printf("\n�մ�~ Ŀ�� ���� �ֽ��ϴ�.");
	}

}
