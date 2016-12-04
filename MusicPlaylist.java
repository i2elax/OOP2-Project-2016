import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

	public class MusicPlaylist extends JFrame
	{ 
		private JTextField welcome; 
		JMenu FileMenu; 
		JLabel Response;
		JButton LButton;
		
		public static void main(String[] args)
			{ 
				MusicPlaylist frame = new MusicPlaylist();
				frame.setVisible(true); 
			}
	
				public MusicPlaylist()
				{ 
					Container ConPane; 
					setTitle("Music Playlist Creator"); 
					setSize(300,300); 
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					
					ConPane=getContentPane();
					ConPane.setLayout(new FlowLayout());
					
					createFileMenu(); 
					
					
					JMenuBar menuBar = new JMenuBar();
					setJMenuBar(menuBar);
					menuBar.setBackground(Color.white); 
					menuBar.add(FileMenu);
					
					welcome = new JTextField(10);
					add(welcome);
					
					thehandler handler = new thehandler(); 
					welcome.addActionListener(handler); 
					
						
				}
				
				   private class thehandler implements ActionListener 
				   { 
					   public void actionPerformed(ActionEvent event)
					   { 
						 String string = ""; 
						 
						 if(event.getSource()==welcome)
							 string=String.format("field 1: %s", event.getActionCommand()); 
					   }
				   }
					
				
				
				
				
						private void createFileMenu()
				   { 
				   	
				   	JMenuItem FileItem; 
				   	FileItem = new JMenuItem("Quit");
				   	FileMenu.add(FileItem);
				   
				   }
	
				  
				   	
				   
			
	}