package churros01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class ChurroStand3 extends ChurroObject{

	BufferedImage three;
	
	ChurroStand3(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
		void draw(Graphics g) {
	        g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
		}
		
		public void ChurroMouse(MouseEvent e) {
			int mouseX = e.getX();
			int mouseY = e.getY();
			int mouseColor = three.getRGB(mouseX, mouseY);
			System.out.println(mouseColor);
		}

}
