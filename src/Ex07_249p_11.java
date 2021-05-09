
public class Ex07_249p_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, hap = 0;
		
		for (;;) {
			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
				System.out.printf("%d\n", hap);
				hap = 0;
				break;
				}
			}
			System.out.printf("아직도 반복중...\n");
		}
		
		
	}

}
