package frameActivity;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;

public class LoginPage {
	Frame f;
	Button login;
	LoginPage(){
		f= new Frame();
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		login = new Button("Login");
		login.setBounds(200, 250, 50,50);
		f.add(login);
		Dialog d = new Dialog(f,"Success",Dialog.DEFAULT_MODALITY_TYPE);
		d.add(new Label("Succ"));
		d.setBounds(100, 150, 100,100);
		d.setVisible(true);
		
	}
	public static void main(String[] args) {
		new LoginPage();
	}

}
