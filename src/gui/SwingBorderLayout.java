package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBorderLayout {

	public static void main(String[] args) {

		JFrame f = new JFrame("FlowLayout ����");
		
		JButton b1 = new JButton("��");
		JButton b2 = new JButton("��");
		JButton b3 = new JButton("��");
		JButton b4 = new JButton("��");
		JButton b5 = new JButton("�߾�");
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		

		f.setSize(300, 150);	//frame�� ũ��
		f.setVisible(true);
	}

}
