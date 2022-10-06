package gui;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx3 extends JFrame{
	
	JLabel label;
	
	EventEx3(){
		
		// component ����
		label = new JLabel();
		label.setBounds(10, 10, 170, 20);
		Button btn = new Button("Click me");
		btn.setBounds(50, 50, 80, 30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�͸�ü�� �̿��� �̺�Ʈ");
			}
		});
		
		add(btn);
		add(label);
		setSize(200, 150);
		setLayout(null);
		setVisible(true);
	}
		

	public static void main(String[] args) {

		new EventEx3();
		
	}

}
