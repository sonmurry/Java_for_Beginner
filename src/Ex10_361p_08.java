import java.io.IOException;

public class Ex10_361p_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "hanbit";
		String input = "";
		int key;
		
		try {
			System.out.print("이름 ==> ");
			while ((key = System.in.read()) != 13) {
				input += Character.toString((char)key);
			}
			if (userName.equals(input)) {
				System.out.println(input + "님 어서오세요~~");
			}else {
				System.out.println(input + "님 등록이 안되었습니다~~");
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
