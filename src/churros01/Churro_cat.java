package churros01;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Churro_cat extends ChurroPanel implements ActionListener, MouseListener {
	JFrame frame;

	public static final int WIDTH = 800;
	public static final int HEIGHT = 650;
	

	Churro_cat() {
		frame = new JFrame();
		cpanel = new ChurroPanel();
		frame.addMouseListener(this);}

	}

	void setup() {
		frame.add(cpanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addKeyListener(cpanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	

}