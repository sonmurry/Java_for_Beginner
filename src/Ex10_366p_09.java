import java.io.FileInputStream;

public class Ex10_366p_09 {

	public static void main(String[] args) throws Exception { //������ǲ��Ʈ���� ���ܸ� ó���ϱ� ���� throws Exception ���� �߰�
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
		int ch;
		
		while ((ch = fis.read()) != -1)
			System.out.print((char)ch);
		
		fis.close();
		
	}

}
