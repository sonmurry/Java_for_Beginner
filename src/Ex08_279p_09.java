
public class Ex08_279p_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][] = {
				{1,2,3,4},
				{5,6,7,8,},
				{9,10,11,12}
				
		};									//2���� �迭�� �ʱ�ȭ
		
		int i, k;
		System.out.printf("aa[0][0]���� aa[2][3]���� ��� \n");
		
		for (i = 0; i < 3; i++) {
			for (k = 0; k <4; k++)
				System.out.printf("%3d", aa[i][k]);	
		System.out.printf("\n");
		}
	}

}
