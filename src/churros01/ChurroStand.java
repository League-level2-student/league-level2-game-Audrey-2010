package churros01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ChurroStand extends ChurroObject implements ActionListener, KeyListener{



JButton churroclicker = new JButton();

ChurroStand(int x, int y, int state){
	super(x, y, state);
	
	churroclicker.addActionListener(this);
	churroclicker.setText("churro??");
}





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("CHURRO");
	if(mix < 1) {
		JOptionPane.showMessageDialog(null, "uh oh looks like you ran out of enough mix to make a churro :O better go to the market to get more");
		
	}
	else {
		churros=churros+1;
		mix=mix-1;
		System.out.println("Churros: // "+churros);
		System.out.println("Mix: // "+mix);
		
	}
	
	if(churros > 0) {
		churros = churros-1;
		money=+6;
	}
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode() == KeyEvent.VK_M) {
		System.out.println(money);
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
