
public class Ex08_291p_Example_21_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][][] = new int[10][10][10];
		int i = 0, j = 0, k = 0, hap = 0, val = 1;
		
		while ( i < 10) {
			while (j < 10) {
				while (k < 10) {
					aa[i][j][k] = val++;
					k++;
				}
				j++;
			}
			i++;
		}
		
		while ( i < 10) {
			while (j < 10) {
				while (k < 10) {
					hap += aa[i][j][k];
					k++;
				}
				j++;
			}
			i++;
		}
		
		System.out.printf("1~1000 까지 합계 : %d",hap);
	}

}
