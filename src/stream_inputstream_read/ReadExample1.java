package stream_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		int readByte;
		
		while(true) {
			readByte = is.read();	// 1 byte를 읽어서 int(4 byte)에 넣는다
			if(readByte == -1) break;
			System.out.println(readByte);
//			System.out.println((char)readByte);
			//안녕하세요 파일은 왜 깨지는지 생각해 볼것
		}
		is.close();
	}

}
