import java.util.Scanner;

public class Ex09_346p_LastExample_07 {

	static int diff(char a, char b) {
		int result;
		String str1 = Character.toString(a);
		String str2 = Character.toString(b);
		
		result = str1.compareTo(str2);
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a, b;
		int res;
		Scanner s = new Scanner(System.in);
		System.out.printf("����1�� �Է� : ");
		a = s.next().charAt(0);
		System.out.printf("����2�� �Է� : ");
		b = s.next().charAt(0);
		
		res = diff(a, b);
	
		System.out.printf("�� ������ ���� ==> %d \n",res);
		
	}



}
