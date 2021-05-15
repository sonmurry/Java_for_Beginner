
public class Ex08_271p_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {100, 200, 300, 400};		//배열 선언과 동시에 초깃값을 대입한다.
		int bb[] = new int[] {100, 200, 300};	//배열 선언과 동시에 new 연산자와 함께 초깃값을 대입한다.
		
		int cc[];
		cc = new int[] {100, 200};				//배열 선언 후 초깃값을 대입한다.
		int[] dd = new int[1];					//배열 선언과 동시에 크기를 결정한 후 초깃값을 대입한다.
		dd[0] = 100;
		int i;
		
		for (i = 0; i < 4; i++)
			System.out.printf("aa[%d] ==>%d\t", i, aa[i]);
		System.out.printf("\n");
		
		for (i = 0; i < 3; i++)
			System.out.printf("bb[%d] ==>%d\t", i, bb[i]);
		System.out.printf("\n");
		
		for ( i = 0; i < 2; i++)
			System.out.printf("cc[%d[ ==>%d\t", i, cc[i]);
		System.out.printf("\n");
		
		for (i =  0; i < 1; i++)
			System.out.printf("dd[%d[ ==>%d\t", i, dd[i]);
		System.out.printf("\n");
		
		
	}

}
