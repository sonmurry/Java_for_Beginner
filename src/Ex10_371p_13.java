import java.io.FileOutputStream;

public class Ex10_371p_13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("c:/temp/data4.txt");
		
		int ch;
		
		while ((ch = System.in.read()) != 13) //�ƽ�Ű�ڵ� 13�� �Է��� ������ Ű���忡�� ���� �ϳ��� read()�� �о�´�.
			fos.write((byte)ch); //�Է��� ���ڸ� ���Ͽ� ����.
		
		fos.close();
		
	}

}
