
public class Ex08_275p_Directly_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {10, 20, 30, 40, 50};
		int count, size;
		int i, hap = 0;
		
		count = aa.length;					// �迭�̸�.length�� �迭 ����� ������ �˷��ش�.
		size = count*Integer.BYTES;			// Integer.BYTES�� ������ ������ ũ�⸦ �˷��ش�.
		
		System.out.printf("�迭 aa[]�� ����� ������ %d �� �Դϴ�. \n", count);
		System.out.printf("�迭 aa[]�� ��ü ũ��� %d �Դϴ�. \n", size);
		
		
		
		for ( i = 0; i < count; i++)
			hap +=aa[i];
		
		System.out.printf("�迭 aa[]�� ��ü ���� ���� %d �Դϴ�. \n", hap);
		
	}

}
