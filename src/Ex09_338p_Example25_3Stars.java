
public class Ex09_338p_Example25_3Stars {

	static short getNumbers() {
		return (short) (Math.random()*45+1); 
		// Math.random 메소드는 0.0부터 1.0미만의 실수중에서 하나를 임의로 반환한다. 
		//이 숫자에 45를 곱하면 0.0~45.0미만의 숫자가 나오고 여기에 1을 더해서 
		//1~45까지의 숫자가 나오도록 조정한다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] lotto = {0,0,0,0,0,0};
		short i, k, num;
		char dupl = 'N';
		
		System.out.printf("** 로또 추첨을 시작합니다. ** \n\n");
		
		for (i = 0; i<6;) {
			num = getNumbers();
		
			for (k = 0 ; k < 6; k++) {
				if (lotto[k] == num)
				dupl = 'Y';
			}
			if (dupl == 'N') 
				lotto[i++] = num;
			else
				dupl = 'N';
		}	
		System.out.printf("추첨된 로또 번호 ==> ");
		for (i = 0; i < 6; i++) {
			System.out.printf("%d  ", lotto[i]);
			
		}
		
		}

}
