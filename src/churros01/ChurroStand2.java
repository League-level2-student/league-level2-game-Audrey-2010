package churros01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChurroStand2 extends ChurroPanel{

	BufferedImage not;
	
	ChurroStand2(){
		try {
			not = ImageIO.read(getClass().getResource("pixilart-drawing copy.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stand2.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + " also " + e.getY() + " :)");
		// 247, 470
		// 200,425
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

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(not, 0, 0, null);
		repaint();
	}

	}
	

