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
					super("Random Song Selector"); 
					setLayout(new FlowLayout());
			
					welcomeMsg = new JLabel("Welcome to Random Song Selector");
					add(welcomeMsg);
			
					loginBtn = new JButton("Login"); 
					add(loginBtn);
			
					registerBtn = new JButton("Register"); 
					add(registerBtn);
			
			
					JPanel center = new JPanel();
					JPanel bottom = new JPanel();
			
					center.add(welcomeMsg);
					bottom.add(loginBtn);
					bottom.add(registerBtn);
			
			
					add(center, BorderLayout.CENTER); 
					add(bottom,BorderLayout.SOUTH);

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
									setVisible(false); 
				
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
