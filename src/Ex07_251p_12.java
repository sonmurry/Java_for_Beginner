
public class Ex07_251p_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i;
		
		myLabel: for (;;) {
			for (i =1 ; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.printf("%d\n", hap);
					hap = 0;
					break myLabel;
				}
			}
			System.out.print("������ �ݺ���....\n");
		}
		
	}

}
