package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {

	JFrame f;
	
	SwingEx2(){
		JFrame f = new JFrame();	//JFrame�� �ν��Ͻ� ����
		
		JButton b = new JButton("��ư");	//JButton �ν��Ͻ� ����
		b.setBounds(50, 20, 100, 20);	//������� ��ϵ��� �󿡼� x��, y��, �ʺ�, ����
		
		f.add(b);	//JFrame�� ��ư �߰�
		
		f.setSize(200, 100);	//�������� ������: ��200�� ���� 100
		f.setLayout(null);	//���̾ƿ� �����ڸ� ����(���)���� ����
		f.setVisible(true);	//�������� ȭ�鿡 ǥ��
	}
	
	public static void main(String[] args) {
		new SwingEx2();
	}
	
}
