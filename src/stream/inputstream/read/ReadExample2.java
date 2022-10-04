package stream.inputstream.read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Temp/test.txt");

		int readByteNo;
		byte[] readBytes = new byte[1];
		String data = "";
		
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			
			//데이터를 0.3 byte 읽고, data에 넣는다.
			data += new String(readBytes, 0, readByteNo);
			System.out.println(data);
		}
//		System.out.println(data);
		is.close();
	}

}
