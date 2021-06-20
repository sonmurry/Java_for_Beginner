import java.util.Scanner;

public class Ex09_309p_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str ="sentence", result = "";
		
		str = s.nextLine();
		
		for (int i = 0; i < str.length(); i++ ) {
			if (str.charAt(i) != ' ') 
				result += str.substring(i,i+1);
		}
		
		System.out.printf("원 문자열 ==> [%s]\n", str);
		System.out.printf("공백제거 ==> [%s]\n", result);
	}

}
