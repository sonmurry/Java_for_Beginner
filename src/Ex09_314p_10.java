import java.util.Scanner;

public class Ex09_314p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int coffee;
		
		System.out.printf("� Ŀ�Ǹ� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		
		System.out.printf("\n# 1. �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("# 2. �������� �غ��Ѵ�\n");
		
		switch (coffee) {
		case 1:
			System.out.printf("# 3.����Ŀ�Ǹ� ź��\n");
			break;
		case 2:
			System.out.printf("# 3.����Ŀ�Ǹ� ź��\n");
			break;
		case 3:
			System.out.printf("# 3.��Ŀ�Ǹ� ź��\n");
			break;
		default:
			System.out.printf("# 3.�ƹ��ų� ź��\n");
			break;
		}
		System.out.printf("# 4. ���� �״´�\n");
		System.out.printf("# 5. ��Ǭ���� ��� ���δ� \n");
		
		System.out.printf("\n�մ�~ Ŀ�� ���� �ֽ��ϴ�.");
	}
	

}
