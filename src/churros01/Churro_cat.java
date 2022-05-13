package churros01;

import javax.swing.JFrame;

public class Churro_cat{
JFrame frame;
public static final int WIDTH = 800;
public static final int HEIGHT = 650;
ChurroPanel cpan = new ChurroPanel();
Churro_cat(){
	frame = new JFrame();
}
void setup() {
	frame.add(cpan);
	frame.setSize(WIDTH, HEIGHT);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}
}
