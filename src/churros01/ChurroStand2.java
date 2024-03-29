package churros01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChurroStand2 extends ChurroObject{

	//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
	
	public static BufferedImage not;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	ChurroStand2(int x, int y, int width, int height){
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		if(needImage) {
			loadImage("pixilart-drawing.png");
		}
		
	}
	
	private void loadImage(String churrofile) {
		if (needImage) {
	        try {
	            not = ImageIO.read(this.getClass().getResourceAsStream(churrofile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
		}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + " also " + e.getY() + " :)");
		// 247, 470
		// 200,425
	}

	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(not, 250, 250, 50, 50, null);
		} else {
			g.setColor(Color.MAGENTA);
			g.fillRect(250, 250, 50, 50);
		}
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = not.getRGB(mouseX, mouseY);
		System.out.println(mouseColor);
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public void paintComponent(Graphics g) {
		g.drawImage(not, 0, 0, null);
		
	}

	}
	



