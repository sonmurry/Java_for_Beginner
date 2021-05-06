import java.util.Scanner;

public class Ex06_208p_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int i, num1, num2, num3, hap = 0;
		
		System.out.print(" 시작값 입력 : ");
		num1 = s.nextInt();
		System.out.print(" 끝값 입력 : ");
		num2 = s.nextInt();
		System.out.print(" 증가값 입력 : ");
		num3 = s.nextInt();
		
		for (i = num1; i <= num2; i+=num3) {
		
			hap += i;
			
		}
		
		System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합: %d", num1, num2, num3, hap);
		
	}

}
