package churros01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class ChurroPanel extends JPanel implements ActionListener, KeyListener{
	final int intro = 0;
	final int churrostand = 1;
	final int map = 2;
	final int marketplace = 3;
	final int directions = 4;
	int currentstate = 0;
	Font testerOne;
	Font testerTwo;
	Font testerThree;
	Font testerFour;
	Font testerFive;
	
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
	
	ChurroPanel(){
		testerOne = new Font("Arial", Font.PLAIN, 48);
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
		g.setFont(testerOne);
		g.setColor(Color.BLACK);
		g.drawString("text one", 100,100);	
	}
	
	void drawChurroStand(Graphics g) {
		g.setFont(testerTwo);
		g.setColor(Color.BLACK);
		g.drawString("text two", 100,100);	
	}
	
	void drawMap(Graphics g){
		g.setFont(testerThree);
		g.setColor(Color.BLACK);
		g.drawString("text three", 100,100);	
	}
	void drawMarketplace(Graphics g) {
		g.setFont(testerFour);
		g.setColor(Color.BLACK);
		g.drawString("text one", 100,100);	
	}
	void drawDirections(Graphics g) {
		g.setFont(testerFive);
		g.setColor(Color.BLACK);
		g.drawString("text five", 100,100);	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentstate == directions) {
		        currentstate = intro;
		    } else {
		        currentstate++;
		    }
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
	}
	
}
