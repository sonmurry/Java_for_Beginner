
public class Ex06_232p_LastExample_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int hap = 0;
		
		for( i = 1; i <= 1000; i++) {
			if (i%3 == 0 || i%7 == 0) 
				hap += i;
		}
		System.out.printf("3�� ��� �Ǵ� 7�� ����� ��: %d \n", hap);
		
	}

}
