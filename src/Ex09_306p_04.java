import java.util.Scanner;

public class Ex09_306p_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int first, last;
		
		System.out.printf("���ڿ� ==> ");
		str = s.nextLine();
		
		first = str.indexOf("Java");
		System.out.printf("���� ó�� ������ Java ��ġ ==> %d\n", first);
		
		last = str.lastIndexOf("Java");
		System.out.printf("�������� ������ Java ��ġ ==> %d", last);
		
		
	}

}
