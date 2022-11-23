package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJBottonEx2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("JBotton을 이용한 버튼"); // JFrame의 인스턴스 생성
		
		final JTextField tf = new JTextField();	//JTextField 생성
		tf.setBounds(10, 20, 350, 20);
		
		JButton b = new JButton("버튼 Click"); //JButton 인스턴스 생성
		b.setBounds(50, 50, 200, 20); // 만들어진 윈도우 상에서 x축, y축, 너비, 높이
		
		//버튼 인스턴스에 이벤트 객체 적용
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼을 클릭했습니다.");
			}
		});
				
		f.add(b);	//JFrame에 버튼추가
		f.add(tf);	//JFrame에 테그스트 필드 추가
		
		f.setSize(310, 150);	//우니
		f.setLayout(null);	//레이아웃 관리자를 설정(사용)하지 않음
		f.setVisible(true);	//프레임을 화면에 포시
				
	}

}