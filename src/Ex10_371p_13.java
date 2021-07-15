import java.io.FileOutputStream;

public class Ex10_371p_13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("c:/temp/data4.txt");
		
		int ch;
		
		while ((ch = System.in.read()) != 13) //아스키코드 13을 입력할 때까지 키보드에서 문자 하나를 read()로 읽어온다.
			fos.write((byte)ch); //입력한 문자를 파일에 쓴다.
		
		fos.close();
		
	}

}
