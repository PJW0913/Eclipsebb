package stream_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readData;
		
		while(true) {
			readData = reader.read();
			
			if(readData == -1) break;
			
			System.out.println((char)readData);
			System.out.println(readData);
		}
		
		reader.close();
		
	}

}
