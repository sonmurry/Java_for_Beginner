import java.util.Scanner;

public class Ex09_307p_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "���ڿ�", strRep, strSub, strAry[];
		
		System.out.printf("�Է� ���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		strRep = str.replace(' ','$');
		strSub = str.substring(3,8);
		strAry = str.split(" ");
		
		System.out.println("�Է� ���ڿ� ==> " + str);
		System.out.println("�ٲ� ���ڿ� ==> " + strRep);
		System.out.println("�Ϻ� ���ڿ� ==> " + strSub);
		for (int i = 0; i < strAry.length ; i++) {
			System.out.println("�и��� ���ڿ� ==> "+ strAry[i]);
		}
	
			
		
	}

}
