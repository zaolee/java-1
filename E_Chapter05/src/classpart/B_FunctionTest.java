package classpart;

public class B_FunctionTest {

	public static void main(String[] args) {
		System.out.println("함수 구현하고 호출하기");
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2); // 매개변수 개수, 데이터타입 맞춰주기
		System.out.println(num1 + " + " + num2 + " = " + sum);

	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;		
	}

}
