import java.util.Scanner;

public class Ex07_254p_Example_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		char ch;
		int i, small, big, num;
		
		System.out.print("문자열을 입력 : ");
		str = s.nextLine();
		
		i = 0;
		small = 0;
		big = 0;
		num = 0;
		
		ch = str.charAt(i);
		
		while (true) {
			if ((int)ch >='a' && (int)ch <='z')
				small += 1;
			else if ((int)ch >='A' && (int)ch <='Z')
				big += 1;
			else if ((int)ch >= 48 && (int)ch <= 57)
				num += 1;
			
			if (++i > str.length()-1)
				break;
			ch = str.charAt(i);
		}
		
		System.out.printf("대문자 %d, 소문자%d, 숫자%d", small, big, num);
	}

}
