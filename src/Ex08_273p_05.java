
public class Ex08_273p_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = new int[100], bb[] = new int[100];
		int i;
		
		for (i = 0; i <100; i++) 
			aa[i] = i*2;
		
		for (i = 0; i <100; i++)
			bb[i] = aa[99-i];
		
		System.out.printf("bb[0]�� %d, bb[99]�� %d �Էµ�\n", bb[0], bb[99]);
	}

}
