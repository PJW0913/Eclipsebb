package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingCardLayout {

	public static void main(String[] args) {

		JFrame f = new JFrame("CardLayout ����");
		
		CardLayout card = new CardLayout(40, 30);  //CardLayout �ν��Ͻ� ����
		f.setLayout(card);
		
		JButton b1, b2, b3;
		b1 = new JButton("�����");
		b2 = new JButton("�޽�");
		b3 = new JButton("ȣ����");
		
		//�͸�Ŭ���� ���·� �̺�Ʈ ������ ����
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane()); //next() �޼ҵ�� ���� �����̳ʷ� �ѱ�.
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
