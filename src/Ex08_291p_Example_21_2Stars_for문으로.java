
public class Ex08_291p_Example_21_2Stars_for문으로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][][] = new int[10][10][10];
		int i, j, k, hap = 0, index = 1;
		
		for (i = 0; i < 10; i++)
			for (j = 0; j <10; j++)
				for (k = 0; k <10; k++) {
					aa[i][j][k] = index++;
				}
		
		for (i = 0; i < 10; i++)
			for (j = 0; j <10; j++)
				for (k = 0; k <10; k++) {
					hap += aa[i][j][k];
				}
		System.out.printf(" 1~ 1000까지의 합 : %d", hap);
		
		
	
	
	}

}
