
public class Ex06_207p_Directly_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap=0;
		
		for (i=1; i<=100; i++) {
			if (i%3 == 0 ) {
				hap += i;
				
			}
		}
		
		System.out.printf(" 1부터 100까지 3의배수의 합: %d", hap);
		
	}

}
