package stream_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "DEF".getBytes();
//		byte[] data = "�ȳ��ϼ���".getBytes();
		
		os.write(data);
		os.flush();
		os.close();

	}

}
