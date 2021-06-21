
public class Ex09_331p_17 {

	static void func1(int a) {
		a = a + 1;
		System.out.printf("전달받을 a ==> %d\n", a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		func1(a);
		System.out.printf("func1() 실행 후의a ==> %d\n",a);
		
	}

}
