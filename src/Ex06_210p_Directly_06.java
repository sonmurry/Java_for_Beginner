import java.util.Scanner;

public class Ex06_210p_Directly_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		int i, dan;
		
		System.out.printf("�� ��? ");
		dan = s.nextInt();
		
		for (i = 9; i >= 1; i--) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}

}
