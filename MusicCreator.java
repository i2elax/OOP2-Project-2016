import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class MusicCreator extends JFrame 
{
	private JLabel welcomeMsg;
	private JButton loginBtn;
	private JButton registerBtn; 
		
		public MusicCreator()
		{ 
			super("Music Playlist Creator"); 
			setLayout(new FlowLayout());
			
			welcomeMsg = new JLabel("Welcome to the Music Playlist Creator");
			add(welcomeMsg);
			
			loginBtn = new JButton("Login"); 
			add(loginBtn);
			
			registerBtn = new JButton("Register"); 
			add(registerBtn);

			thehandler handler = new thehandler(); 
			loginBtn.addActionListener(handler);
			registerBtn.addActionListener(handler);
		}
		
		private class thehandler implements ActionListener
		{ 
			public void actionPerformed(ActionEvent loginEvent)
			{ 
				LoginWindow loginwindow = new LoginWindow();
				loginwindow.setVisible(true); 
				
				
			}
		}
}
