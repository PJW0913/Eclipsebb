package stream_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {

		long start = 0;
		long end = 0;
		
		FileInputStream fis1  = new FileInputStream("C:/Temp/cat.jpg");
//		start = System.currentTimeMillis();
		start = System.nanoTime();
		while(fis1.read() != -1) {}
//		end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println("사용하지 않을 때: " +(end-start) +"ns");
		
		FileInputStream fis2  = new FileInputStream("C:/Temp/cat.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
//		start = System.currentTimeMillis();
		start = System.nanoTime();
		while(fis1.read() != -1) {}
//		end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println("사용했을 때: " +(end-start) +"ns");
		
		
		
	}

}
