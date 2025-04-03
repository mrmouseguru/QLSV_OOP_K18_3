package exception;

public class DemoExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int result = 0;
		
		try {
			result = a / 0;//ngoại lệ
		}
		catch(ArithmeticException arithmeticException) {
			//code
			System.out.println("Lỗi chia cho 0: " + 
			arithmeticException.getMessage());
		}
		
		
		
		System.out.println("Result: " + result);

	}

}
