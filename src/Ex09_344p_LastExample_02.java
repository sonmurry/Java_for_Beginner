import java.util.Scanner;

public class Ex09_344p_LastExample_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1, str2;
		
		System.out.printf("문자열 1을 입력 : ");
		str1 = s.nextLine();
		System.out.printf("문자열 2를 입력 : ");
		str2 = s.nextLine();
		System.out.printf("합쳐진 문자열 ==> %s\n",str1+str2);
		System.out.printf("문자열 1 길이 ==> %d\n", str1.length());
		System.out.printf("문자열 2 길이 ==> %d\n",str2.length());
		
		if (str1.compareTo(str2) == 0) 
			System.out.printf("두 문자열은 같다. \n");
		else 
			System.out.printf("두 문자열은 다르다. \n");
				
			
		
	}

}
