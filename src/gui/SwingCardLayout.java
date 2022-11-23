package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingCardLayout {

	public static void main(String[] args) {

		JFrame f = new JFrame("CardLayout 예제");
		
		CardLayout card = new CardLayout(40, 30);  //CardLayout 인스턴스 생성
		f.setLayout(card);
		
		JButton b1, b2, b3;
		b1 = new JButton("손흥민");
		b2 = new JButton("메시");
		b3 = new JButton("호날두");
		
		//익명클래스 형태로 이벤트 리스너 정의
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane()); //next() 메소드로 다음 컨테이너로 넘김.
			}
		};
		
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(350, 150);
		f.setVisible(true);
	}

}