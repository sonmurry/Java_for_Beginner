
public class Ex06_231p_LastExample_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int odd_hap = 0;	//Ȧ���� �հ� ����
		int even_hap = 0;	//¦���� �հ� ����
		
		for (i = 1; i <= 100; i++) {
			if (i%2 == 0) 
				even_hap += i;
			else
				odd_hap += i;	
		}
		System.out.printf(" Ȧ���� ��: %d \n", odd_hap);
		System.out.printf(" ½���� ��: %d \n",  even_hap);
		
	}

}
