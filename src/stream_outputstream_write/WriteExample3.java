package stream_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args)  throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "HIJ".getBytes();
//		byte[] data = "æ»≥Á«œººø‰".getBytes();
		
		os.write(data,1,2);
		os.flush();
		os.close();

	}

}
