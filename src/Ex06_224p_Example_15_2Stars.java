
public class Ex06_224p_Example_15_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		
		for (i = 0; i <= 127; i++) {
			if (i%16 == 0) {
				System.out.println("------------------------");
				System.out.println("10진수\t16진수\t문자");
				System.out.println("------------------------");
			}
			System.out.printf("%6d %6x %6c\n",i,i,i);
		}
	}

}
