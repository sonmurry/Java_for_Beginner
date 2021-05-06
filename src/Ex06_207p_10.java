import java.util.Scanner;

public class Ex06_207p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, hap=0;
		
		Scanner s = new Scanner (System.in);
		
		System.out.printf(" 값 입력 : ");
		num = s.nextInt();
		
		for (i = 1; i <= num; i++ ) {
			
			hap += i;
		}
		System.out.printf(" 1부터 %d까지의 합 : %d", num, hap );
	}

}
