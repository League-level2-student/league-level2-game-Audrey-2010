package churros01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ChurroStand extends Churro_cat implements ActionListener{
JButton churroclicker = new JButton();
int churros = 0;
int mix = 0;
int money;
Timer churroshoppers;
Random ran = new Random();

void click() {
	cpan.add(churroclicker);
	churroclicker.addActionListener(this);
}

ChurroStand(){
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(mix < 1) {
		JOptionPane.showMessageDialog(null, "uh oh looks like you ran out of enough mix to make a churro :O better go to the market to get more");
	}
	else {
		churros=churros+1;
	}
}
}
