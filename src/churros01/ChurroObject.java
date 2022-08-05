package churros01;

import java.awt.event.MouseEvent;

public class ChurroObject {

	int x;
	int y;
	int width;
	int height;
	int state;
	int money = 0;
	int mix = 2;
	int churros = 0;
	String mix2;
	
	ChurroObject(int x, int y, int width, int height){
		this.x=(x);
		this.y=(y);
		
		this.width=(width);
		this.height=(height);
	}
	
	void update() {
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
