import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_373p_14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:/temp/data5.txt");
		String str;
		
		while(!(str = sc.nextLine()).equals("")) //�Է��� ���� ��� �ִ� ���� �ƴϸ� 13���� ó���Ѵ�. �� �׳� ���͸� ������ �Է��� �����Ѵ�.
			fw.write(str + "\r\n");
		
		fw.close();
		
			
	}

}
