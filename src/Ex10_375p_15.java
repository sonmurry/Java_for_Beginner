import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_375p_15 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("c:/windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/temp/data9.txt");
		
		int ch;
		
		while ((ch = fis.read()) != -1)
			fos.write((byte)ch); 
		
		System.out.print("복사완료");
		fis.close();
		fos.close();
	}

}
