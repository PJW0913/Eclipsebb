package server_socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientScoket {

	public static void main(String[] args) {

		try {
			//SocketServer�� ip�� port ������ �̿��� ServerSocket�� ������ Socket �ν��Ͻ��� ����
			
			Socket s = new Socket("172.30.1.13", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("�ȳ��ϼ��� ���ؿ� Client���� ������ �޼��� �Դϴ�.");
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}