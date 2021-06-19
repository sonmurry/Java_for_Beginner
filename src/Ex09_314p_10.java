import java.util.Scanner;

public class Ex09_314p_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int coffee;
		
		System.out.printf("어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙)  ");
		coffee = s.nextInt();
		
		System.out.printf("\n# 1. 뜨거운 물을 준비한다");
		System.out.printf("\n# 2. 종이컵을 준비한다");
		switch (coffee) {
		case 1:
			System.out.printf("\n# 3. 보통커피를 탄다 ");
			break;
		case 2:
			System.out.printf("\n# 3. 설탕커피를 탄다 ");
			break;
		case 3:
			System.out.printf("\n# 3. 블랙커피를 탄다 ");
			break;
		default:
			System.out.printf("\n아무거나 탄다"); break;
		}
		System.out.printf("\n# 4. 물을 붓는다");
		System.out.printf("\n# 5. 스푼으로 저어서 녹인다 \n");
	
		
		System.out.printf("\n손님~ 커피 여기 있습니다.");
	}

}
