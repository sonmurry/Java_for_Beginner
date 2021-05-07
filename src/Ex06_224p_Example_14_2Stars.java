
public class Ex06_224p_Example_14_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, k;
		
		for(i =2; i <=9; i++) {
			System.out.printf(" #Á¦%d´Ü#  ", i);
		}
		System.out.printf("\n");
		
		for (k = 1; k <=9; k++) {
			System.out.printf("\n");
			for (i = 2; i <=9; i++) {	
			System.out.printf("%dX %d= %2d  ", i, k, i*k);
			}
				
		}
		
	}

}
