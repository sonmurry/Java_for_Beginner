import java.io.FileInputStream;

public class Ex10_367p_10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
		int ch;
		byte[] bt = new byte[1024];
		
		int i = 0;
		while ((ch = fis.read()) != -1) {
			bt[i] = (byte)ch;
			i++;
		}
		
		System.out.print(new String(bt)); //byte형식의 배열을 String형식으로 출력
		fis.close();
	}

}
