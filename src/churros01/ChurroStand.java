package churros01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ChurroStand implements ActionListener, KeyListener{

int churros = 0;
int mix = 2;
int money;
Timer churroshoppers;
Random ran = new Random();
JButton churroclicker = new JButton();

ChurroStand(){
	churroclicker.addActionListener(this);
	
}

void customers() {
	churroshoppers = new Timer(ran.nextInt(6000)/60, this);
	churroshoppers.start();
	if(churroshoppers.isRunning()==false) {
		money=+6;
		churros=-1;
		
	}
	}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(mix < 1) {
		JOptionPane.showMessageDialog(null, "uh oh looks like you ran out of enough mix to make a churro :O better go to the market to get more");
		
	}
	else {
		churros=churros+1;
		mix=mix-1;
		customers();
		System.out.println("Churros: // "+churros);
		System.out.println("Mix: // "+mix);
		
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
