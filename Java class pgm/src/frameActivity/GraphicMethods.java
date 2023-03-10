package frameActivity;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GraphicMethods implements MouseListener {
	Button b;
	Frame f;
	Graphics ga;
		GraphicMethods(){
			f = new Frame();
			f.setSize(500, 500);
			f.setLayout(null);
			f.setVisible(true);
			f.setBackground(Color.gray);
			ga=f.getGraphics(); 
			f.addMouseListener(this);
		}
		public static void main(String[] args) {
					new GraphicMethods();
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			ga.setColor(Color.green);
			ga.drawLine(250,250,e.getX(),e.getY());

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
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}
