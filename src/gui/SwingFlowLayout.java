package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingFlowLayout {

	public static void main(String[] args) {

		JFrame f = new JFrame("FlowLayout 예제");
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		// setLayout() 메소드로 배치관리자 설정
		f.setLayout(new FlowLayout(FlowLayout.RIGHT)); //오른쪽 정렬 설정

		f.setSize(300, 100);	//frame의 크기
		f.setVisible(true);
	}

}
