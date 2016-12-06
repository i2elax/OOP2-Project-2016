import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RegisterWindow extends JFrame 
{
	JLabel name, Uname , Pword , Email; 
	JTextField userName ,jtName, passWord, eMail;
	JButton register;
	
	public static ArrayList<saveUser> Userlist = new ArrayList<saveUser>();
	
	public void SaveUser() throws Exception 
	{ 
		File usersdata = new File("usersdata.dat"); 
		FileOutputStream fileOut = new FileOutputStream(usersdata); 
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		
		objectOut.writeObject(Userlist);
		objectOut.close(); 
	}

	public RegisterWindow()
	{ 
		super("Register"); 
		setLayout(new FlowLayout()); 
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE); 
		
		name = new JLabel ("Enter Name: ");
		add(name);
		jtName = new JTextField(10);
		add(jtName);
		
		Uname = new JLabel ("Enter Desired Username: ");
		add(Uname);
		userName = new JTextField(10);
		add(userName);
		
		Pword = new JLabel ("Enter Desired Password: ");
		add(Pword);
		passWord = new JTextField(10);
		add(passWord);
		
		Email = new JLabel ("Enter Your Email: ");
		add(Email);
		eMail = new JTextField(10);
		add(eMail);
		
		register = new JButton("Register");
		add(register);
		
		registerhandler UserDataHandler = new registerhandler();
		register.addActionListener(UserDataHandler);
		
		
		
		
	}
	private class registerhandler implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent regEvent)
		{ 
			String usernameAsString = userName.getText();
			String passwordAsString = passWord.getText();
			String nameAsString = jtName.getText(); 
			String emailAsString = eMail.getText(); 
			
			saveUser user = new saveUser (usernameAsString,passwordAsString,nameAsString,emailAsString); 
			
				if(Userlist.size() == 0)
				{ 
					Userlist.add(user);
					
					try
					{
						SaveUser();
					}
					
					catch(Exception save)
					{ 
						JOptionPane.showMessageDialog(null,"Sorry , Could not save your data","Error",JOptionPane.WARNING_MESSAGE);
					}
					
					JOptionPane.showMessageDialog(null,"Success! Your Credentials have been saved","Welcome to Music Playlist Creator",JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
				}
				 
				
		}
	}
}
