package stream_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");

//		byte[]data = "ABC".getBytes();
		byte[]data = "æ»≥Á«œººø‰".getBytes("EUC-KR");
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		System.out.println(data.length);
		os.flush();
		os.close();
	}

}
