import java.io.File;
import java.util.Scanner;

public class Ex10_370p_12 {

	public static void main(String[] args)throws Exception{ 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("c:/temp/data2.txt"));
		//File�� �����ؼ� Scanner  Ŭ������ ������ �����Ѵ�.
		
		int hap = 0;
		
		while (sc.hasNextLine()) //������ ���������� �ݺ��Ѵ�.
								 //���� ���� �ִ��� �̸� �ľ��Ͽ� ���� ���� ���� ��� True�� ��ȯ 
			hap += sc.nextInt();
		
		System.out.println("�հ� : " + hap);
		sc.close();
		
	}

}
