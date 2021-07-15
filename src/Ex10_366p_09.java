import java.io.FileInputStream;

public class Ex10_366p_09 {

	public static void main(String[] args) throws Exception { //파일인풋스트림의 예외를 처리하기 위해 throws Exception 문을 추가
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
		int ch;
		
		while ((ch = fis.read()) != -1)
			System.out.print((char)ch);
		
		fis.close();
		
	}

}
