package server;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(9999);
			
			Socket s = ss.accept();	//Socket 연결요청이 오면 Socket 인스턴스를 반환
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("message= " + str);
			ss.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
