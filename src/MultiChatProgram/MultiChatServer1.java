package MultiChatProgram;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer1 {
	
	private ServerSocket ss = null;
	private Socket s = null;
	
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();
	
	public void start() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("server start");
			while(true) {
				s = ss.accept();
				ChatThread chat = new ChatThread();
				chatlist.add(chat);
				chat.start();
				
			}
		} catch (Exception e) {
			System.out.println("[MultiChatServer]start( ) Exception 발생!!");
		}
	}
	
	public static void main(String[] args) {
		MultiChatServer1 server = new MultiChatServer1();
		server.start();

	}
	
	class ChatThread extends Thread {
		
		String msg;
		String[] rmsg;
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		public void run() {
			boolean status = true;
			System.out.println("##ChatThread start...");
			try {
				
				
				while(status) {
					msg = inMsg.readLine();
					rmsg = msg.split("/");
					if(rmsg[1].equals("logout")) {
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 방을 나갔습니다.");
						status = false;
					}else if (rmsg[1].equals("login")) {
						msgSendAll("server/" + rmsg[0] + "님이 입장했습니다.");
					} else {
						msgSendAll(msg);
					}
				}
				this.interrupt();
				System.out.println("##" + this.getName() + "stop!!");
			} catch(IOException e) {
				chatlist.remove(this);
//				e.printStackTrace();
				System.out.println("[ChatThread]run() IOException 발생!!");
			}
		}
		
		public void msgSendAll(String msg) throws IOException { //안녕하세요를 모든 클라이언트에
			this.msg = msg;
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			msg = din.readUTF();
			System.out.print(rmsg[0] + " > " + msg);
			
			dout.writeUTF(msg);
			dout.flush();
			din.close();
			s.close();
			ss.close();
			
		}
	}

}
