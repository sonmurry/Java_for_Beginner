import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_368p_11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/windows/win.ini");
		//FileReader�� c:/Windows/win.ini������ ����.
		BufferedReader bReader = new BufferedReader(fReader);
		// �� ������ �б� ���� BufferedReader Ŭ������ Ȱ���Ѵ�. 
		
		String str = null;
		
		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		bReader.close();
		fReader.close();
		
	}

}
