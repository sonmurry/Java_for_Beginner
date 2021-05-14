import java.util.Scanner;

public class Ex07_254p_Example_17_2Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		
		int i, hap = 0, start, finish, multi;
		
		System.out.print("합계의 시작값 ==> ");
		start = s.nextInt();
		System.out.print("합계의 끝값 ==> ");
		finish = s.nextInt();
		System.out.print("배수 ==> ");
		multi = s.nextInt();
		
		
		i = start;
		while (i<= finish) {
			if (i%multi == 0) {
				hap += i;
			}
			i++;
			
		}
		s.close();
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", start, finish, multi, hap);
	}

}
