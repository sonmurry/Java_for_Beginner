import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_369p_Directly_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/windows/win.ini");
		//FileReader�� c:/Windows/win.ini������ ����.
		BufferedReader bReader = new BufferedReader(fReader);
		// �� ������ �б� ���� BufferedReader Ŭ������ Ȱ���Ѵ�. 
		
		String str = null;
		
		int i = 1;
		while ((str = bReader.readLine()) != null) {
			System.out.print(i+"�� : ");
			System.out.println(str);
			i++;
		}
		bReader.close();
		fReader.close();
		
	}

}
