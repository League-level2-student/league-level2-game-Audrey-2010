package churros01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChurroManager implements MouseListener, ActionListener{
	public ChurroStand3 chur;
	ChurroManager(ChurroStand3 chur){
		this.chur = new ChurroStand3(250, 250, 50, 50);
		this.chur = (chur);
		
		}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = chur.three.getRGB(mouseX, mouseY);	
		System.out.println(mouseColor);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("e");
	}
	
	}
	

