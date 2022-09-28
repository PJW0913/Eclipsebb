package runtimeexception;

public class ArrayIndexOutOfBoundsException {	//배열에서 인덱스 범위를 초과하여 사용할 경우 발생

	public static void main(String[] args) {

		String data1 = args[0];
		String data2 = args[1];	//2개의 실행 매개 값을 주지 않았기 때문에
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
//[Run] - [Run Configuration] - [Arguments]탭 - [Program arguments]
//배열 인덱스 입력
// -> args[0]: 배열
//    args[1]: 인덱스
// 출력