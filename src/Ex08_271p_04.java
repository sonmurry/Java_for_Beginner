
public class Ex08_271p_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {100, 200, 300, 400};		//�迭 ����� ���ÿ� �ʱ갪�� �����Ѵ�.
		int bb[] = new int[] {100, 200, 300};	//�迭 ����� ���ÿ� new �����ڿ� �Բ� �ʱ갪�� �����Ѵ�.
		
		int cc[];
		cc = new int[] {100, 200};				//�迭 ���� �� �ʱ갪�� �����Ѵ�.
		int[] dd = new int[1];					//�迭 ����� ���ÿ� ũ�⸦ ������ �� �ʱ갪�� �����Ѵ�.
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
