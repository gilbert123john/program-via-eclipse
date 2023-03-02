//Creation of frames by object
package frameActivity;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameCreationUsingObject implements WindowListener {
	FrameCreationUsingObject() {
		Frame f = new Frame("Creation of fram by object");
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(this);// registering the event
	}

	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new FrameCreationUsingObject();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
