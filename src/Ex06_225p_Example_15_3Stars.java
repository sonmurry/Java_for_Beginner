import java.util.Scanner;

public class Ex06_225p_Example_15_3Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;		//�Է¹��� ���ڿ� ������ ����
		int str_cnt;	//�Է��� ������ ������ ������ ������ ����
		int i;			
		
		System.out.printf("���ڸ� �Է� : ");
		str = s.nextLine();		//���ڿ��� �Է¹޴´�.
		
		System.out.printf("\n");
		System.out.printf("�Է��� ���ڿ� ==> %s\n", str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		
		str_cnt = str.length();		//�Է��� ���ڿ��� ������ ���
		
		for (i = str_cnt-1; i >= 0; i-- ) {				//�Էµ� ������ŭ �Ųٷ� �� ���ھ� ����Ѵ�.
			System.out.printf("%c", str.charAt(i));
		}
			
	}
}

