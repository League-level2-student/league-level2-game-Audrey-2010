package churros01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Churro_cat implements ActionListener{
JFrame frame;
JButton churroclicker = new JButton();
public static final int WIDTH = 800;
public static final int HEIGHT = 650;
ChurroPanel cpanel = new ChurroPanel();

Churro_cat(){
	frame = new JFrame();
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
