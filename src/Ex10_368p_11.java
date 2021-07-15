import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_368p_11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/windows/win.ini");
		//FileReader로 c:/Windows/win.ini파일을 연다.
		BufferedReader bReader = new BufferedReader(fReader);
		// 행 단위로 읽기 위해 BufferedReader 클래스를 활용한다. 
		
		String str = null;
		
		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		bReader.close();
		fReader.close();
		
	}

}
