import java.util.Scanner;

public class Ex08_269p_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int aa[] = new int[4];
		int hap = 0, i;
		
		for (i = 0; i < 4; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
			aa[i] = s.nextInt();
			
			hap += aa[i];
			
		}
		System.out.printf(" 합계 ==> %d", hap);
		
	}

}
