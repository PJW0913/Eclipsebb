package runtimeexception;

public class ArrayIndexOutOfBoundsException {	//�迭���� �ε��� ������ �ʰ��Ͽ� ����� ��� �߻�

	public static void main(String[] args) {

		String data1 = args[0];
		String data2 = args[1];	//2���� ���� �Ű� ���� ���� �ʾұ� ������
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
//[Run] - [Run Configuration] - [Arguments]�� - [Program arguments]
//�迭 �ε��� �Է�
// -> args[0]: �迭
//    args[1]: �ε���
// ���