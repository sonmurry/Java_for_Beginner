
public class Ex10_355p_Directly_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		int result;
		try {
			
			if (b == 0 && a != 0)
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			else if (b == 0 && a == 0)
				throw new Exception("0�� ������ 0�Դϴ�.");
			result = a/b;
			
		}catch (Exception e) {
			System.out.print("�߻� ���� ==> ");
			System.out.println(e.getMessage());
		}
	}

}
