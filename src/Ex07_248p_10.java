
public class Ex07_248p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap = 0;
		
		for (i = 1; i <= 100; i++) {
			
			if (i%3 == 0)
				continue;
			else
			hap += i;
			
		}
		System.out.printf("1~100���� ��(3�� ��� ����) : %d", hap);
	}

}
