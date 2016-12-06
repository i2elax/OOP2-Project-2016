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

			loginhandler Lhandler = new loginhandler(); 
			loginBtn.addActionListener(Lhandler);
			
			registerhandler Rhandler = new registerhandler();
			registerBtn.addActionListener(Rhandler);
			
			
		}
		
		private class loginhandler implements ActionListener
		{ 
			public void actionPerformed(ActionEvent loginEvent)
			{ 
				LoginWindow loginwindow = new LoginWindow();
				loginwindow.setVisible(true);
				
				
			}
		}

		private class registerhandler implements ActionListener
		{ 
			public void actionPerformed(ActionEvent registerEvent)
			{ 
				RegisterWindow regwindow = new RegisterWindow(); 
				regwindow.setVisible(true);
			}
		}


}
