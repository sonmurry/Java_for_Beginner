
public class Ex07_247p_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, hap = 0;
		
		for (;i <= 100; i++) { 		//만약 while문을 통해 증감식을 수행하도록 하면 45가 아닌 46이 값으로 나온다. 주의할 것.
			hap += i;
			
			
			if (hap >= 1000) break;
			
		}
		System.out.printf(" 총합이 1000을 넘기는 시점은 %d를 더하는 시점입니다.\n", i);
	}

}
