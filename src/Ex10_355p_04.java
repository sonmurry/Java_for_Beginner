
public class Ex10_355p_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0;
		int result;
		try {
			if (b == 0)
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			result = a/b;
			
		}catch (Exception e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		}
	}

}
