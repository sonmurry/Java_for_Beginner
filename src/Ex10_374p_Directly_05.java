import java.io.PrintWriter;
import java.util.Scanner;

public class Ex10_374p_Directly_05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("c:/temp/data6.txt");
		
		String str;
		
		while (!(str = sc.nextLine()).equals("")) {
			pw.println(str);
		}
		pw.close();
		
	}

}
