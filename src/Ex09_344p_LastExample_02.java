import java.util.Scanner;

public class Ex09_344p_LastExample_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1, str2;
		
		System.out.printf("���ڿ� 1�� �Է� : ");
		str1 = s.nextLine();
		System.out.printf("���ڿ� 2�� �Է� : ");
		str2 = s.nextLine();
		System.out.printf("������ ���ڿ� ==> %s\n",str1+str2);
		System.out.printf("���ڿ� 1 ���� ==> %d\n", str1.length());
		System.out.printf("���ڿ� 2 ���� ==> %d\n",str2.length());
		
		if (str1.compareTo(str2) == 0) 
			System.out.printf("�� ���ڿ��� ����. \n");
		else 
			System.out.printf("�� ���ڿ��� �ٸ���. \n");
				
			
		
	}

}
