import java.util.Scanner;

public class Ex07_254p_Example_17_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		
		int i, hap = 0, start, finish, multi;
		
		System.out.print("�հ��� ���۰� ==> ");
		start = s.nextInt();
		System.out.print("�հ��� ���� ==> ");
		finish = s.nextInt();
		System.out.print("��� ==> ");
		multi = s.nextInt();
		
		
		i = start;
		while (i<= finish) {
			if (i%multi == 0) {
				hap += i;
			}
			i++;
			
		}
		s.close();
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d", start, finish, multi, hap);
	}

}
