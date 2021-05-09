import java.util.Scanner;

public class Ex07_242p_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int answer;
		
		do {
			System.out.printf("\n손님 주문 하시겠습니까 ?\n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 ==> ");
			answer = s.nextInt();
			switch (answer) {
			case 1:
				System.out.printf("#카페라떼 주문하셨습니다.\n"); break;
			case 2:
				System.out.printf("#카푸치노 주문하셨습니다.\n"); break;
			case 3:
				System.out.printf("#아메리카노 주문하셨습니다.\n"); break;
			case 4:
				System.out.printf("주문하신 커피 준비하겠습니다.\n"); break;
			default:
				System.out.printf("잘못 입력하셨습니다.\n"); break;
				
			}		
			
		}while (answer != 4);
			
		
	}

}
