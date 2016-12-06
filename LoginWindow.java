import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class LoginWindow extends JFrame 
{
	JLabel loginMsg;
	JLabel passMsg; 
	JTextField userName; 
	JPasswordField userPass;
	JButton login;
	
	
/*
	public void Loaduser() throws Exception 
	{ 	
		RegisterWindow = new RegisterWindow();
		ArrayList<saveUser> Userlist = RegisterWindow.getList();
		File usersdata = new File("usersdata.dat"); 
		FileInputStream fileIn = new FileInputStream(usersdata); 
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		
		Userlist = (ArrayList<saveUser>) objectIn.readObject(); 
		objectIn.close(); 
	}*/ 
		
	public LoginWindow()
		{ 
			super("Login"); 
			setLayout(new FlowLayout()); 
			setSize(300,300);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(HIDE_ON_CLOSE); 
			
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
			
			loginbuttonhandler OpenMainWindow = new loginbuttonhandler();
			login.addActionListener(OpenMainWindow);
			
			
			
			
		}
	private class loginbuttonhandler implements ActionListener
	{ 
		public void actionPerformed(ActionEvent registerEvent)
		{ 
			setVisible(false);
			MainWindow mainwindow = new MainWindow();
			mainwindow.setVisible(true);
			
			//splashwindow.setVisible(false);
			 
			
		}
	}
	
}
