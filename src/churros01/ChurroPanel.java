package churros01;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ChurroPanel extends JPanel{
	final int intro = 0;
	final int churrostand = 1;
	final int map = 2;
	final int marketplace = 3;
	final int directions = 4;
	int currentstate = 0;
	
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
		
	}
	
	void drawChurroStand(Graphics g) {
		
	}
	
	void drawMap(Graphics g){
		
	}
	void drawMarketplace(Graphics g) {
		
	}
	void drawDirections(Graphics g) {
		
	}
	
}
