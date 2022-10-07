package MultiChatProgram;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient1 implements ActionListener, Runnable {
	
	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	private JPanel loginPanel;
	private JButton loginButton;
	private JLabel label1;
	private JTextField idInput;
	private JPanel logoutPanel;
	private JLabel label2;
	private JButton logoutButton;
	private JPanel msgPanel;
	private JTextField msgInput;
	private JButton exitButton;
	private JFrame jframe;
	private JTextArea msgOut;
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	boolean status;
	
	public MultiChatClient1(String ip) {
		this.ip = ip;
		
		loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(10);
		loginButton = new JButton("입장하기");
		loginButton.addActionListener(this);
		label1 = new JLabel("대화명");
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("방나가기");
		logoutButton.addActionListener(this);
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		msgInput.addActionListener(this);
		
		exitButton = new JButton("채팅 종료");
		exitButton.addActionListener(this);
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		jframe = new JFrame("::온라인 채팅방::");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		clayout.show(tab,  "login"); 
		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);		
	}
	
	public void connectServer() {
		try {
			
			Socket s = new Socket("localhost", 7777);
			
			System.out.println("[Client]Server 연결 성공!!");
			s.close();
			
			
		} catch(Exception e) {
			System.out.println("접속 예외 발생!");
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		if(obj == exitButton) {
			System.exit(0);
		} else if (obj == loginButton) {
			id = idInput.getText();
			label2.setText("대화명: " + id);
			clayout.show(tab, "logout");
			connectServer();
		} else if (obj == logoutButton) {
			outMsg.println(id + "/" + "logout");
			msgOut.setText(" ");
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			status = false;
		} else if (obj == msgInput) {
			outMsg.println(id + "/" + msgInput.getText());
			msgInput.setText(" ");
		}
	}
	@Override
	public void run() {
		String msg;
		String[] rmsg;
		status = true;
		while(status) {
			try {
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
			} catch (IOException e) {
				status = false;
			}
		}
		System.out.println("[MultiChatClient]" + thread.getName() + "종료됨");
	}
	
	public static void main(String[] args) {
		
		new MultiChatClient1("localhost");

	}

}
