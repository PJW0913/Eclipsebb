package server;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientScoket {

	public static void main(String[] args) {

		try {
			//SocketServer�� ip�� port ������ �̿��� ServerSocket�� ������ Socket �ν��Ͻ��� ����
			
			Socket s = new Socket("localhost", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("�ȳ��ϼ��� Client���� ������ �޼��� �Դϴ�.");
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
