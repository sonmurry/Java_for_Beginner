import java.io.File;
import java.util.Scanner;

public class Ex10_371p_Directly_04 {

	public static void main(String[] args)throws Exception{ 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("c:/temp/data3.txt"));
		//File�� �����ؼ� Scanner  Ŭ������ ������ �����Ѵ�.
		
		float hap = 0f;
		
		while (sc.hasNextLine()) //������ ���������� �ݺ��Ѵ�.
								 //���� ���� �ִ��� �̸� �ľ��Ͽ� ���� ���� ���� ��� True�� ��ȯ 
			hap += sc.nextFloat();
		
		System.out.printf("�հ� : %7.1f", hap);
		sc.close();
		
	}

}
