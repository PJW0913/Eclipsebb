package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJBottonEx2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("JBotton�� �̿��� ��ư"); // JFrame�� �ν��Ͻ� ����
		
		final JTextField tf = new JTextField();	//JTextField ����
		tf.setBounds(10, 20, 350, 20);
		
		JButton b = new JButton("��ư Click"); //JButton �ν��Ͻ� ����
		b.setBounds(50, 50, 200, 20); // ������� ������ �󿡼� x��, y��, �ʺ�, ����
		
		//��ư �ν��Ͻ��� �̺�Ʈ ��ü ����
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("��ư�� Ŭ���߽��ϴ�.");
			}
		});
				
		f.add(b);	//JFrame�� ��ư�߰�
		f.add(tf);	//JFrame�� �ױ׽�Ʈ �ʵ� �߰�
		
		f.setSize(310, 150);	//���
		f.setLayout(null);	//���̾ƿ� �����ڸ� ����(���)���� ����
		f.setVisible(true);	//�������� ȭ�鿡 ����
				
	}

}
