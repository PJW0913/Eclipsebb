package stream_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		char[] data = "È«±æµ¿".toCharArray();
		System.out.println("data ¼ö : " + data.length);
		writer.write(data);
		
		writer.flush();
		writer.close();

	}

}
