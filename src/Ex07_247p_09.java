
public class Ex07_247p_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, hap = 0;
		
		for (;i <= 100; i++) { 		//���� while���� ���� �������� �����ϵ��� �ϸ� 45�� �ƴ� 46�� ������ ���´�. ������ ��.
			hap += i;
			
			
			if (hap >= 1000) break;
			
		}
		System.out.printf(" ������ 1000�� �ѱ�� ������ %d�� ���ϴ� �����Դϴ�.\n", i);
	}

}
