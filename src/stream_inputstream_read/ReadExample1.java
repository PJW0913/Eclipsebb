package stream_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		int readByte;
		
		while(true) {
			readByte = is.read();	// 1 byte�� �о int(4 byte)�� �ִ´�
			if(readByte == -1) break;
			System.out.println(readByte);
//			System.out.println((char)readByte);
			//�ȳ��ϼ��� ������ �� �������� ������ ����
		}
		is.close();
	}

}
