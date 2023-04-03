import javax.swing.SwingUtilities;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyFr extends JFrame {
	
	JPasswordField password;
	JTextField login;
	JLabel labelLogin;
	JLabel labelPassword;
	JButton btn_Ok;
	JButton btn_Cancel;
	
	public MyFr() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setLayout(null);
		
		
		labelLogin = new JLabel("Login");
		labelLogin.setBounds(100, 50, 200, 30);
		login = new JTextField();
		login.setBounds(150, 50, 200, 30);
		this.add(login);
		this.add(labelLogin);
		

		
		labelPassword = new JLabel("Parol");
		labelPassword.setBounds(100, 100, 200, 30);
		password = new JPasswordField();
		password.setBounds(150, 100, 200, 30);
		this.add(labelPassword);
		this.add(password);
		

		
		btn_Ok = new JButton("Ok");
		btn_Ok.setBounds(200, 150, 60, 30);
		
		btn_Cancel = new JButton("Otmena");
		btn_Cancel.setBounds(250, 150, 100, 30);
		
		this.add(btn_Ok);
		this.add(btn_Cancel);
		
		
		this.setVisible(true);
	}
	
}

public class Lab6 {

	public static void main(String[] args) {

		new MyFr();
	}

}
