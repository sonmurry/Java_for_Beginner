
public class Ex08_273p_Directly_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = new int[100], bb[] = new int[100];
		int i;
		
		for (i = 0; i < 100; i++) 
			aa[i] = i*3;
		
		for (i = 0; i <= 50; i++)
			bb[i] = aa[50-i];
		
		for (i = 51; i < 100; i++)
			bb[i] = aa[i-50];
		
		System.out.printf("bb[0]ดย %d, bb[99]ดย %d ภิทยตส\n", bb[0], bb[99]);
	}

}
