package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingJLebelEx1 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		
		JLabel I;
		
		I = new JLabel("ÀÌ¹ÌÁöÃâ·Â", new ImageIcon("cat.png"), SwingConstants.RIGHT);
		I.setBounds(0, 10, 150, 64);
		
		f.add(I);
		f.setSize(200, 150);
		f.setLayout(null);
		f.setVisible(true);
	}

}