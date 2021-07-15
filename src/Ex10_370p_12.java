import java.io.File;
import java.util.Scanner;

public class Ex10_370p_12 {

	public static void main(String[] args)throws Exception{ 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("c:/temp/data2.txt"));
		//File을 지정해서 Scanner  클래스의 변수를 선언한다.
		
		int hap = 0;
		
		while (sc.hasNextLine()) //파일의 마지막까지 반복한다.
								 //다음 행이 있는지 미리 파악하여 다음 행이 있을 경우 True를 반환 
			hap += sc.nextInt();
		
		System.out.println("합계 : " + hap);
		sc.close();
		
	}

}
