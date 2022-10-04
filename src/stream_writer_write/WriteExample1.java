package stream_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		char[] data = "ȫ�浿�̾߾�".toCharArray();
		System.out.println("data ��: " + data.length);
		
		for(int i =0; i < data.length; i++) {
			writer.write(data[i]);
			System.out.println("data ��: " + data.length);
			
		}
		
		writer.flush();
		writer.close();
	}

}
