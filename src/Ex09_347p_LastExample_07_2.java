import java.util.Scanner;

public class Ex09_347p_LastExample_07_2 {

	static int diff(char a, char b) {
		
		int result;
		if ( a >= b)
			result = (int) a - (int)b;
		else
			result = (int) b - (int)a;
		
		return result;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a, b;
		int res;
		
		System.out.printf("���� 1�� �Է� : ");
		a = s.next().charAt(0);
		System.out.printf("���� 2�� �Է� : ");
		b = s.next().charAt(0);
		
		res = diff(a,b);
		
		System.out.printf("�� ������ ���� => %d",res);
		
		
	}

}
