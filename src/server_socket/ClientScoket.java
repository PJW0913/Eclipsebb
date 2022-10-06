package server_socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientScoket {

	public static void main(String[] args) {

		try {
			//SocketServer의 ip와 port 정보를 이용해 ServerSocket에 연결할 Socket 인스턴스를 생성
			
			Socket s = new Socket("172.30.1.13", 5001);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("안녕하세요 박준우 Client에서 보내는 메세지 입니다.");
			dout.flush();
			dout.close();
			s.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
