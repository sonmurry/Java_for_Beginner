
public class Ex07_248p_Directly_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, hap = 0;
		
		
		while ( i <= 100) {
			hap += i;
			if (hap >= 1000) break;
			i++;
		}
		System.out.printf(" 총합이 1000을 넘기는 시점은 %d를 더하는 시점입니다.\n", i);
	}

}
