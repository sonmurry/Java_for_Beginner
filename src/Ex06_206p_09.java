
public class Ex06_206p_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap=0;
		
		for (i=500; i<=1000; i++) {
			if (i%2 == 1 ) {
				hap += i;
				
			}
		}
		
		System.out.printf(" 500부터 1000까지 홀수의 합: %d", hap);
		
	}

}
