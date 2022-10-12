package exception_runtime;

public class NumberFormatExceptionExample {	//문자열을 숫자로 변환할 때 숫자로 변환될 수 없는 문자가 포함되어 있을 경우 발생

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	//NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	}

}
