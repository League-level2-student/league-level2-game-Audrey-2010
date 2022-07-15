package churros01;

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
BufferedImage not;


Churro_cat() throws Exception{
	frame = new JFrame();
	cpanel = new ChurroPanel();
	frame.addMouseListener(this);
	not = ImageIO.read(getClass().getResource("pixilart-drawing copy.png"));
	
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

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getX()+" also "+e.getY()+" :)");
	//247, 470
	//200,425
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	int mouseX = e.getX();
	int mouseY = e.getY();
	int mouseColor = not.getRGB(mouseX, mouseY);	
	System.out.println(mouseColor);
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


}