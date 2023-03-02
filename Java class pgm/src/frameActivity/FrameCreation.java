/**
 * by extending frame class(inheritance)
 */
package frameActivity;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.color.*;

public class FrameCreation extends Frame{
	FrameCreation(){
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		setBackground(Color.gray);
		//setBackground(Color.Co());
		
		Button b = new Button("test");
		b.setBounds(100, 100, 100, 30);
	}

	public static void main(String[] args) {
//		FrameCreation f  =
				new FrameCreation();
	}

}
