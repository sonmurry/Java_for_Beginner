
public class Ex07_248p_Directly_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, hap = 0;
		
		
		while ( i <= 100) {
			hap += i;
			if (hap >= 1000) break;
			i++;
		}
		System.out.printf(" ������ 1000�� �ѱ�� ������ %d�� ���ϴ� �����Դϴ�.\n", i);
	}

}
