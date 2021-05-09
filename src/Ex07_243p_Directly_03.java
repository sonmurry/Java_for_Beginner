import java.util.Scanner;

public class Ex07_243p_Directly_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int answer;
		
		do {
			System.out.printf("\n손님 주문 하시겠습니까 ?\n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 ==> ");
			answer = s.nextInt();
			
			if (answer == 1) 
				System.out.print("#카페라떼 주문하셨습니다.\n");
			else if (answer == 2)
				System.out.print("#카푸치노 주문하셨습니다.\n");
			else if (answer == 3)
				System.out.print("#아메리카노 주문하셨습니다.\n");
			else if (answer == 4)
				System.out.print("주문하신 커피 준비하겠습니다.\n");
			else 
				System.out.print("잘못 입력하셨습니다.\n");
			
		}while (answer != 4);
			
		
	}

}
