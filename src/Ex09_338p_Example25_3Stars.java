
public class Ex09_338p_Example25_3Stars {

	static short getNumbers() {
		return (short) (Math.random()*45+1); 
		// Math.random �޼ҵ�� 0.0���� 1.0�̸��� �Ǽ��߿��� �ϳ��� ���Ƿ� ��ȯ�Ѵ�. 
		//�� ���ڿ� 45�� ���ϸ� 0.0~45.0�̸��� ���ڰ� ������ ���⿡ 1�� ���ؼ� 
		//1~45������ ���ڰ� �������� �����Ѵ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] lotto = {0,0,0,0,0,0};
		short i, k, num;
		char dupl = 'N';
		
		System.out.printf("** �ζ� ��÷�� �����մϴ�. ** \n\n");
		
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
		System.out.printf("��÷�� �ζ� ��ȣ ==> ");
		for (i = 0; i < 6; i++) {
			System.out.printf("%d  ", lotto[i]);
			
		}
		
		}

}
