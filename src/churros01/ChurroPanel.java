package churros01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ChurroPanel extends JPanel implements ActionListener, KeyListener, MouseListener{
	final int intro = 0;
	final int churrostand = 1;
	final int map = 2;
	final int marketplace = 3;
	final int directions = 4;
	int currentstate = 0;
	Font introooooO;
	Font directions_to_directions;
	Font sonobutton;
	Font directioooooOns;
	Font directioooooOnspt2;
	Font directioooooOnspt3;
	Font counter;
	ChurroPanel cpanel;
	Timer frameDraw;
	ChurroStand2 exists;
	JButton button;
	ChurroStand3 version3 = new ChurroStand3(100, 100, 50 , 50);

	BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
	@Override
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
		if(currentstate == intro){
		    drawIntro(g);
		}else if(currentstate == churrostand){
		    drawChurroStand(g);
		}else if(currentstate == map){
		    drawMap(g);
		}else if(currentstate == marketplace){
		    drawMarketplace(g);
		}else if(currentstate == directions){
		    drawDirections(g);
		}
		
	}
	
	public void startGame() {
		
		exists = new ChurroStand2(250, 250, 50, 50);
		
		}
		
	
	
	
	ChurroPanel(){
		introooooO = new Font("Arial", Font.PLAIN, 48);
		sonobutton = new Font("Arial", Font.PLAIN, 48);
		directioooooOns = new Font("Arial", Font.PLAIN, 48);
		directioooooOnspt2 = new Font("Arial", Font.PLAIN, 48);
		directioooooOnspt3 = new Font("Arial", Font.PLAIN, 48);
		directions_to_directions = new Font("Arial", Font.PLAIN, 48);
		button = new JButton();
		counter = new Font("Arial", Font.PLAIN, 48);
	    frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	    if(needImage) {
	    	loadImage("pixilart-drawing copy.png");
	    	
	}
	}
	void updateIntro() {
		
	}
	void updateChurroStand() {
	
		
	}
	void updateMap() {
		
	}
	void updateMarketplace() {
		
	}
	void updateDirections() {
		
	}
	
	
	
	void drawIntro(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT);
		g.setFont(introooooO);
		g.setColor(Color.BLACK);
		g.drawString("Churro Cat :)", 100,100);	
		g.setFont(directions_to_directions);
		g.setColor(Color.BLACK);
		g.drawString("press 4 for direction", 100,600);	
		
	}
	
	void drawChurroStand(Graphics g) {
		
		g.fillRect(10, 10, 100, 100);
		g.setColor(Color.RED);
		g.fillRect(0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT);
		g.setFont(sonobutton);
		g.setColor(Color.BLACK);
		g.drawString("theres supposed to be a button here", 20,100);	
		button.setText(":)");
		if (gotImage) {
			g.drawImage(image, 0, 0, 1, Churro_cat.WIDTH, null);
		}
			
		version3.draw(g);
		
		
	}
	
	void drawMap(Graphics g){
		
		if (gotImage) {
			g.drawImage(image, 0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT, null);
			

		}
		else{ g.setColor(Color.BLACK);
		g.fillRect(0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT); }
	}
	void drawMarketplace(Graphics g) {
			
		g.setColor(Color.yellow);
		g.fillRect(0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT);
	}
	void drawDirections(Graphics g) {
			
		g.setColor(Color.MAGENTA);
		g.fillRect(0, 0, Churro_cat.WIDTH, Churro_cat.HEIGHT);
		g.setFont(directioooooOns);
		g.setColor(Color.BLACK);
		g.drawString("click on the button to make churros ", 50,100);	
		g.setFont(directioooooOnspt2);
		g.setColor(Color.BLACK);
		g.drawString(":> if you run out of mix go to the ma", 50,200);
		g.setFont(directioooooOnspt3);
		g.setColor(Color.BLACK);
		g.drawString("rket", 0,600);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			    if (currentstate == directions) {
			        currentstate = intro;
			    } else {
			        currentstate++;
			    }
			}
		    System.out.println("ENTER");
		}
		if (e.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		}
		if(e.getKeyCode()==KeyEvent.VK_4) {
			currentstate = directions;
		}
		if(e.getKeyCode()==KeyEvent.VK_1) {
			currentstate = churrostand;
		}
	}
	
	//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
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(currentstate == intro){
		    updateIntro();
		}else if(currentstate == churrostand){
		    updateChurroStand();
		}else if(currentstate == map){
		    updateMap();
		}else if(currentstate == marketplace){
		    updateMarketplace();
		}else if(currentstate == directions){
		    updateDirections();
		}
		repaint();
		System.out.println("ACTION");
		
		
		
	}

	

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	



//TODO Auto-generated method stub 185

void loadImage(String imageFile) {
	if (needImage) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
			gotImage = true;
		} catch (Exception e) {

		}
		needImage = false;
	}
}
}
