import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame 
{
	JLabel loginMsg;
	JLabel passMsg; 
	JTextField userName; 
	JPasswordField userPass;
	JButton login;
	 
	
		public LoginWindow()
		{ 
			super("Login"); 
			setLayout(new FlowLayout()); 
			setSize(300,300);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE); 
			
			loginMsg = new JLabel ("Username: ");
			add(loginMsg);
			userName = new JTextField(10);
			add(userName);
			passMsg = new JLabel ("Password: ");
			add(passMsg); 
			userPass = new JPasswordField(10);
			add(userPass);
			login = new JButton("login");
			add(login);
			
			
			
			
		}
	
}
