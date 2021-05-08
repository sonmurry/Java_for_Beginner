
public class Ex06_232p_LastExample_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int hap = 0;
		
		for( i = 1; i <= 1000; i++) {
			if (i%3 == 0 || i%7 == 0) 
				hap += i;
		}
		System.out.printf("3의 배수 또는 7의 배수의 합: %d \n", hap);
		
	}

}
