import java.util.Scanner;

public class Ex06_208p_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int i, num1, num2, num3, hap = 0;
		
		System.out.print(" ���۰� �Է� : ");
		num1 = s.nextInt();
		System.out.print(" ���� �Է� : ");
		num2 = s.nextInt();
		System.out.print(" ������ �Է� : ");
		num3 = s.nextInt();
		
		for (i = num1; i <= num2; i+=num3) {
		
			hap += i;
			
		}
		
		System.out.printf(" %d���� %d���� %d�� ������ ���� ��: %d", num1, num2, num3, hap);
		
	}

}
