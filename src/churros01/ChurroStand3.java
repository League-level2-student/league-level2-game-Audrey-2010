package churros01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class ChurroStand3 extends ChurroObject implements MouseListener, ActionListener{

	public static BufferedImage three;
	public static boolean needimage = true;
	public static boolean gotimage = false;
	JButton insert = new JButton();
	
	ChurroStand3(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		if(needimage){
			loadimage("pixilart-drawing.png");
			
			
		}
		System.out.println("i exist");

		insert.addActionListener(this);
	}
	
		void draw(Graphics g) {
			if(gotimage) {
				g.drawImage(three, x, y, width, height, null);
			}
			else { g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
			}
		}
		

		void loadimage(String churrofile) {
		    if (needimage) {
		        try {
		            three = ImageIO.read(this.getClass().getResourceAsStream(churrofile));
			    gotimage = true;
		        } catch (Exception e) {
		            
		        }
		        needimage = false;
		    }
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("hi");
			int mouseX = e.getX();
			int mouseY = e.getY();
			int mouseColor = three.getRGB(mouseX, mouseY);	
			System.out.println(mouseColor);
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("hopefully this prints :')");
		}
		
}
