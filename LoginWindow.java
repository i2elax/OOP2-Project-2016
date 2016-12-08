import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginWindow extends JFrame 
{
	JLabel loginMsg;
	JLabel passMsg; 
	JTextField userName; 
	JPasswordField userPass;
	JButton login,back;
	 
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
	}*/  // can't get this working 
		
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
			back = new JButton("Back to Main Menu");
			add(back);
			
			JPanel top = new JPanel();
			JPanel center = new JPanel();
			JPanel bottom = new JPanel(); 
			
			top.add(loginMsg);
			top.add(userName);
			center.add(passMsg);
			center.add(userPass);
			bottom.add(login);
			bottom.add(back);
			
			add(top, BorderLayout.NORTH); 
			add(center, BorderLayout.CENTER); 
			add(bottom,BorderLayout.SOUTH);
			
			loginbuttonhandler OpenMainWindow = new loginbuttonhandler();
			login.addActionListener(OpenMainWindow);
			
			backbuttonhandler OpenMainMenu = new backbuttonhandler(); 
			back.addActionListener(OpenMainMenu); 
			
			
		}
			private class loginbuttonhandler implements ActionListener
			{ 
				public void actionPerformed(ActionEvent registerEvent)
					{ 
						setVisible(false);
						MainWindow mainwindow = new MainWindow();
						mainwindow.setVisible(true);	
					}
			}
	
			private class backbuttonhandler implements ActionListener
			{ 
				public void actionPerformed(ActionEvent registerEvent)
					{ 
						setVisible(false);
						MusicCreator mainmenu = new MusicCreator();
						mainmenu.setVisible(true);
						mainmenu.setSize(300,300);
					}
			}
}
