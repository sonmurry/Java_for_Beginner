import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_373p_14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:/temp/data5.txt");
		String str;
		
		while(!(str = sc.nextLine()).equals("")) //입력한 행이 비어 있는 행이 아니면 13행을 처리한다. 즉 그냥 엔터를 누르면 입력을 종료한다.
			fw.write(str + "\r\n");
		
		fw.close();
		
			
	}

}
