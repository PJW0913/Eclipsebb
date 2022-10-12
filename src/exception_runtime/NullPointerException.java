package exception_runtime;

public class NullPointerException {	//객체 참조가 없는 상태의 참조 변수로 객체 접근 연산자 도트를 사용할 경우 발생

	public static void main(String[] args) {

		String data = null;
		System.out.println(data.toString());
	}

}
