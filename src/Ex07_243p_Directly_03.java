import java.util.Scanner;

public class Ex07_243p_Directly_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int answer;
		
		do {
			System.out.printf("\n�մ� �ֹ� �Ͻðڽ��ϱ� ?\n");
			System.out.printf("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� ==> ");
			answer = s.nextInt();
			
			if (answer == 1) 
				System.out.print("#ī��� �ֹ��ϼ̽��ϴ�.\n");
			else if (answer == 2)
				System.out.print("#īǪġ�� �ֹ��ϼ̽��ϴ�.\n");
			else if (answer == 3)
				System.out.print("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.\n");
			else if (answer == 4)
				System.out.print("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.\n");
			else 
				System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
			
		}while (answer != 4);
			
		
	}

}
