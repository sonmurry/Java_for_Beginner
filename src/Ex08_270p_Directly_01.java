import java.util.Scanner;

public class Ex08_270p_Directly_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int aa[] = new int[10];
		int hap = 0, i = 0;
		
		while (i < 10) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			aa[i] = s.nextInt();
			
			hap += aa[i];
			i++;
		}
		System.out.printf(" �հ� ==> %d \n", hap);
		
	}

}
