package frameActivity;

import java.awt.Button;
import java.awt.Frame;

public class CreatingButton extends Frame{

	CreatingButton(){
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		
		Button b = new Button("test");
		b.setBounds(200, 200, 100, 50);
		add(b);
	}


	public static void main(String[] args) {
				new CreatingButton();
	}

}
