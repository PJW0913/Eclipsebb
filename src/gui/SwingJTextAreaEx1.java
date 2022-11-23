package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingJTextAreaEx1 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		
		JTextArea area = new JTextArea("d이 영역안에 텍스트를 편집 할 수 있습니다.");
		
		area.setBounds(10, 30, 260, 70);
		
		f.add(area);
		f.setSize(300, 150);
		f.setLayout(null);
		f.setVisible(true);
	}

}