
public class Ex10_352p_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = new int[3];
		try {
			aa[3] = 100;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("배열 첨자가 배열 크기보다 커요 ~");
			
		}
	}

}
