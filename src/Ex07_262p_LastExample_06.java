
public class Ex07_262p_LastExample_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int hap = 0;
		
		i = 1;
		while (i <= 100) {
			if ( i%5 == 0 || i%8 == 0)
				hap += i;
			i++;
		}
		System.out.printf("5의 배수와 8의 배수의 합: %d \n", hap);
		
	}

}
