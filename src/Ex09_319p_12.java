import java.util.Scanner;

public class Ex09_319p_12 {

	static int coffee_machine(int button) {
		System.out.printf("# 1.(�ڵ�����) �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("# 2.(�ڵ�����) �������� �غ��Ѵ�\n");
		
		switch (button) {
		case 1:
			System.out.printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 3:
			System.out.printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 4:
			System.out.printf("# 3.(�ڵ�����) ��Ŀ�Ǹ� ź��\n"); break;
		default:
			System.out.printf("# 3.(�ڵ�����) �ƹ��ų� ź��\n"); break;
		}
		
		System.out.printf("# 4.(�ڵ�����) ���� �״´�\n");
		System.out.printf("# 4.(�ڵ�����) ��Ǭ���� ��� ���δ�\n");
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.printf("A�մ�, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		System.out.printf("A�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n\n");
		
		System.out.printf("B�մ�, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		System.out.printf("B�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n\n");
		
		System.out.printf("C�մ�, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		System.out.printf("C�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n\n");
	}

}
