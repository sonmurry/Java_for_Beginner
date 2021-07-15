import java.io.File;
import java.util.Scanner;

public class Ex10_371p_Directly_04 {

	public static void main(String[] args)throws Exception{ 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("c:/temp/data3.txt"));
		//File을 지정해서 Scanner  클래스의 변수를 선언한다.
		
		float hap = 0f;
		
		while (sc.hasNextLine()) //파일의 마지막까지 반복한다.
								 //다음 행이 있는지 미리 파악하여 다음 행이 있을 경우 True를 반환 
			hap += sc.nextFloat();
		
		System.out.printf("합계 : %7.1f", hap);
		sc.close();
		
	}

}
