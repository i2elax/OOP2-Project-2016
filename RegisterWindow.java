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
	
	public static ArrayList<saveUser> Userlist = new ArrayList<saveUser>(); //Creates Arraylist called Userlist 
	
	public ArrayList <saveUser> getList() //Creates a getList method for access to UserList in another class
	{ 
		return Userlist;
	}
	
	public void SaveUser() throws Exception //creates save UserMethod 
	{ 
		File usersdata = new File("usersdata.dat"); //Creates Userdata.dat file
		FileOutputStream fileOut = new FileOutputStream(usersdata); //File outputs to the file Userdata 
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); //Object outputs to the file output stream 
		
		objectOut.writeObject(Userlist); //writes the object Userlist which is an Array 
		objectOut.close(); // closes the object
	}

	public RegisterWindow() 
	{ 
		super("Register"); //sets name of RegisterWindow as Super  
		setLayout(new FlowLayout()); // sets layout 
		setSize(300,300); //sets size 
		setLocationRelativeTo(null); //sets location to center of screen 
		setDefaultCloseOperation(HIDE_ON_CLOSE); //sets default close to hide  
		
		name = new JLabel ("Enter Name: "); //creates new JLabel 
		add(name); //adds JLabel 
		jtName = new JTextField(10); //creates JTextField
		add(jtName); //Adds JTextField 
		
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
		
		registerhandler UserDataHandler = new registerhandler(); //Creates new registerhandler object 
		register.addActionListener(UserDataHandler); //adds registerhandler to register button 
		
		
		
		
	}
	private class registerhandler implements ActionListener //creates registerhandler class and implements everything from ActionListener
	{ 
		public void actionPerformed(ActionEvent regEvent) //adds action performed which is part of ActionListener 
		{ 
			String usernameAsString = userName.getText(); //creates new String variable and makes it equals to the input on Username JTextfield. 
			String passwordAsString = passWord.getText();
			String nameAsString = jtName.getText(); 
			String emailAsString = eMail.getText(); 
			
			saveUser user = new saveUser (usernameAsString,passwordAsString,nameAsString,emailAsString); //creates new saveUser object with parameters equals to Strings above 
			
				if(Userlist.size() == 0) 
				{ 
					Userlist.add(user); //userlist adds user 
					
					try
					{
						SaveUser(); //executes saveUser method found in SaveUser.java 
					}
					
					catch(Exception save) //If saveuser doesn't work this is what executes. 
					{ 
						JOptionPane.showMessageDialog(null,"Sorry , Could not save your data","Error",JOptionPane.WARNING_MESSAGE); //JOptionPane displays error 
					}
					
					JOptionPane.showMessageDialog(null,"Success! Your Credentials have been saved","Welcome to Music Playlist Creator",JOptionPane.INFORMATION_MESSAGE);
					setVisible(false); //else this is what shows. 
				}
				 
				
		}
	}
}
