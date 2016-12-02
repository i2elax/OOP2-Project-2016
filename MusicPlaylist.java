import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

	public class MusicPlaylist extends JFrame implements ActionListener
	{ 
		JMenu FileMenu; 
		JMenu EditMenu;
		JLabel Response;
		
			public static void main (String args [])
			{ 
				MusicPlaylist frame = new MusicPlaylist();
				frame.setVisible(true); 
			}
	
				public MusicPlaylist()
				{ 
					Container ConPane; 
					setTitle("Music Playlist Creator"); 
					setSize(300,300); 
					setDeafultCloseOperation(EXIT_ON_CLOSE);
					
					ConPane=getContentPane();
					ConPane.setLayout(new FlowLayout());
					
					createFileMenu(); 
					createEditMenu();
					
					JMenuBar menuBar = new JMenuBar();
					setJMenuBar(menuBar);
					menuBar.setBackground(Color.white); 
					menuBar.add(FileMenu);
					menuBar.add(EditMenu);
						
				}
				
				   private void createFileMenu()
				   { 
				   	
				   	JMenuItem FileItem; 
				   	FileMenu = new JMenu("File"); 
				   	FileItem = new JMenuItem("Register");
				   	FileMenu.add(FileItem);
				   	 
				   	FileItem = new JMenuItem("Login");
				   	FileMenu.add(FileItem);
				   	
				   	FileItem = new JMenuItem("Quit");
				   	FileMenu.add(FileItem);
				   
				   }
	
				  private void createFileMenu()
				   { 
				   	
				   	JMenuItem EditItem; 
				   	EditMenu = new JMenu("Edit"); 
				   	EditItem = new JMenuItem("Create Playlist");
				   	EditMenu.add(EditItem);
				   	 
				   	EditItem = new JMenuItem("View Playlist");
				   	EditMenu.add(FileItem);
				   	
				  
				   }
	
	}