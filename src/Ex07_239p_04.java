import java.io.IOException;
import java.util.Scanner;

public class Ex07_239p_04 {

	public static void main(String[] args) throws IOException { // throws IOException�� System.in.read();�� ����ϱ� ���� �ʼ� �����̴�.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b;
		char ch;
		
		while (true) {
			System.out.print("ù ��° ����� ���� �Է��Ͻÿ� : ");
			a = s.nextInt();
			System.out.print("�� ��° ����� ���� �Է��Ͻÿ� : ");
			b = s.nextInt();
			System.out.print("����� �����ڸ� �Է��Ͻÿ� : ");
			ch = (char)System.in.read();		//�����ڸ� ���������� �Է¹޴´�.
			
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
				System.out.print("�����ڸ� �߸� �Է��߽��ϴ�. \n");		//������ ������ ���� ���� �Է����� �� ���� �޽����� ������ ����
			}
			
		}
		
	}

}
