import java.util.Scanner;

public class Ex09_304_Directly_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("���ڿ� �Է� ==> ");
		str = s.nextLine();
		
		System.out.printf("��� ���ڿ� ==> ");
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i)+1);
		}
	}

}
