
public class Ex08_287p_Directly_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] stack = new char[5];
		int top = 0;
		
		
		if ( top >=5 )
			System.out.printf("�ͳ��� �� ���� ���� �� ��. \n");
		else {
			stack[top] = 'A';
			System.out.printf(" %c  �ڵ����� �ͳο� ��\n", stack[top]);
			top++;
		}
		if ( top >=5 )
			System.out.printf("�ͳ��� �� ���� ���� �� ��. \n");
		else {
			stack[top] = 'B';
			System.out.printf(" %c �ڵ����� �ͳο� ��\n", stack[top]);
			top++;
		}
		if ( top >=5 )
			System.out.printf("�ͳ��� �� ���� ���� �� ��. \n");
		else {
			stack[top] = 'C';
			System.out.printf(" %c �ڵ����� �ͳο� ��\n", stack[top]);
			top++;
		}
		
		System.out.printf("\n");
		
		if (top <= 0)
			System.out.printf("���� �ͳο� �ڵ����� ����. \n");
		else {
			top--;
			System.out.printf(" %c �ڵ����� �ͳ��� �������� \n", stack[top]);
			stack[top] = ' ';
		}
		if (top <= 0)
			System.out.printf("���� �ͳο� �ڵ����� ����. \n");
		else {
			top--;
			System.out.printf(" %c �ڵ����� �ͳ��� �������� \n", stack[top]);
			stack[top] = ' ';
		}
		if (top <= 0)
			System.out.printf("���� �ͳο� �ڵ����� ����. \n");
		else {
			top--;
			System.out.printf(" %c �ڵ����� �ͳ��� �������� \n", stack[top]);
			stack[top] = ' ';
		}
		
	}

}
