package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {

	JFrame f;
	
	SwingEx2(){
		JFrame f = new JFrame();	//JFrame의 인스턴스 생성
		
		JButton b = new JButton("버튼");	//JButton 인스턴스 생성
		b.setBounds(50, 20, 100, 20);	//만들어진 우니도우 상에서 x축, y축, 너비, 높이
		
		f.add(b);	//JFrame에 버튼 추가
		
		f.setSize(200, 100);	//윈도우의 사이즈: 폭200과 높이 100
		f.setLayout(null);	//레이아웃 관리자를 설정(사용)하지 않음
		f.setVisible(true);	//프레임을 화면에 표시
	}
	
	public static void main(String[] args) {
		new SwingEx2();
	}
	
}
