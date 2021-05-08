
public class Ex06_231p_LastExample_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int odd_hap = 0;	//홀수의 합계 변수
		int even_hap = 0;	//짝수의 합계 변수
		
		for (i = 1; i <= 100; i++) {
			if (i%2 == 0) 
				even_hap += i;
			else
				odd_hap += i;	
		}
		System.out.printf(" 홀수의 합: %d \n", odd_hap);
		System.out.printf(" 쩍수의 합: %d \n",  even_hap);
		
	}

}
