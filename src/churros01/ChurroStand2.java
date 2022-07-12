package churros01;

import java.awt.Color;
import java.awt.Graphics;

public class ChurroStand2 extends ChurroObject{

	ChurroStand2(int x, int y, int state, int width, int height) {
		super(x, y, state, width, height);
		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
	
}
