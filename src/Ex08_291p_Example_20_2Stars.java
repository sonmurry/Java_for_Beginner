
public class Ex08_291p_Example_20_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][] = new int[9][9];
		int i, k;
		
		for (i = 0; i <= 8; i++) {
			for (k = 0; k <= 8; k++) 
				aa[i][k] = (i+1)*(k+1);
		}
		
		for (i = 0; i <= 8; i++) {
			for (k = 0; k <= 8; k++) {
				System.out.printf("%dX%d=%2d  ", k+1, i+1, aa[i][k]);
				
			}
			System.out.printf("\n");
			
		}
		
	}

}
