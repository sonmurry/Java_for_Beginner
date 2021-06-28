
public class Ex09_346p_LastExample_06 {

	class myInt {
		int a;
	}
	
	public class Exam {
		static void func(myInt m) {
			m.a = m.a + 10;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myInt m = new myInt();
		m.a = 100;
		
		func(m);
		System.out.printf("%d", m.a);
	}

}
