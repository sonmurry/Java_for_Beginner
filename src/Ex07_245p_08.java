import java.util.Scanner;

public class Ex07_245p_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		
		
		while (true) {
			System.out.printf("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			System.out.printf("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			if ( a  == 0) 
				break;
			
				System.out.printf("%d + %d = %d \n", a, b, a+b);	
	
		}
		System.out.printf("%d�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.", a);
	}

}
