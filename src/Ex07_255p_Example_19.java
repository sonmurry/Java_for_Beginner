import java.util.Scanner;

public class Ex07_255p_Example_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;		//���ڿ� ����
		char ch;		//������ ����
		int i, k;		//�ݺ������� ����� ������ ����
		int star;		//���� ������ ������ �� ���� ������ ����
		
		int given;
		
		
		System.out.print("���ڸ� ���� �� �Է� : ");
		str = s.nextLine();		//�Է¹��� ���ڸ� ���ڿ��� �Է¹޴´�.
		
		i = 0; 		//���ڿ��� ��ġ�� ��Ÿ�� ����
		ch = str.charAt(i);		//���ڿ����� �� ����(����)�� �����Ѵ�(ù ��° ����)
		while (true) {
			star = (int)ch -48; 	//���� ���ڿ��� i��° ����(������)�� ���������� ĳ����, ������� 5�� �ƽ�Ű���� 53�̹Ƿ� 5�� ����� ���� -48�� �Ѵ�.
			
			for ( k = 0; k < star; k++)
				System.out.print("*");		//���� ������ŭ *�� ����Ѵ�.
			System.out.print("\n");
			
			if (++i> str.length()-1) 		//���� i�� ������Ų �� ���ڿ����� -1���� ũ�� while���� �����Ѵ�.
				break;
			ch = str.charAt(i);			//���ڿ����� �� ����(����)�� �����Ѵ�.
			
		}
	}

}
