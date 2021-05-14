import java.util.Scanner;

public class Ex07_254p_Example_18_교재풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		char ch;
		int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
		int i, small, big, num;
		
		System.out.print("문자열을 입력 : ");
		str = s.nextLine();
		
		i = 0;
		
		do {
			ch = str.charAt(i);
			
			if (ch >='a' && ch <='z')
				lower_cnt++;
			if (ch >='A' && ch <='Z')
				upper_cnt++;
			if (ch >= '0' && ch <= '9')
				digit_cnt++;
			
			i++;
		} while (i<str.length());
		System.out.printf("대문자 %d, 소문자%d, 숫자%d", upper_cnt, lower_cnt, digit_cnt);
	}

}
