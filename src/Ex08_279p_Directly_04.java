
public class Ex08_279p_Directly_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][] = new int[3][4];
		int i, k;			//�迭�� ÷�ڷ� Ȱ���� ������ ����
		int val = 1;		// �迭�� �� ���� �ʱ�ȭ
		
		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				aa[i][k] = val;
			val+=2;
			}
		}
		
		System.out.printf("aa[2][3]���� aa[0][0]���� ��� \n");
		
		for (i = 2; i >= 0; i--) {
			for (k = 3; k >= 0; k--) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.printf("\n");
		}
	}

}
