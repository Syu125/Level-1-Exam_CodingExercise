import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CodingPortion implements ActionListener {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	public static void main(String[] args) {
		CodingPortion cp = new CodingPortion();
		cp.run();
	}

	void run() {
		f1.setVisible(true);
		p1.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		f1.setTitle("Color Teacher");
		b1.setBackground(Color.yellow);
		b1.setOpaque(true);
		b2.setBackground(Color.RED);
		b2.setOpaque(true);
		b3.setBackground(Color.BLUE);
		b3.setOpaque(true);
		b4.setBackground(Color.GREEN);
		b4.setOpaque(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f1.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		if (arg0.getSource() == b1) {
			speak("Yellow");
		}
		if (arg0.getSource() == b2) {
			speak("Red");
		}
		if (arg0.getSource() == b3) {
			speak("Blue");
		}
		if (arg0.getSource() == b4) {
			speak("Green");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say "+ words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
