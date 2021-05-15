
public class Ex08_274p_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {10, 20, 30, 40, 50};
		int count, size;
		
		count = aa.length;					// 배열이름.length는 배열 요소의 개수를 알려준다.
		size = count*Integer.BYTES;			// Integer.BYTES는 정수형 변수의 크기를 알려준다.
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다. \n", count);
		System.out.printf("배열 aa[]의 전체 크기는 %d 입니다. \n", size);
		
		
		
	}

}
