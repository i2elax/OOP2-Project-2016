import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class MusicPlaylistCreator extends JFrame implements ActionListener{ 
		
		JMenu FileMenu;
		JMenu EditMenu; 
		JLabel response; 
	
			public static void main(String[] args){
        	MusicPlaylistCreator frame = new MusicPlaylistCreator();
        	frame.setVisible(true);
    }
	
			public MusicPlaylistCreator(){
				Container cPane;
				setTitle("Music Playlist Creator");
				setSize(300,200); 
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				cPane = getContentPane();
				cPane.setLayout(new FlowLayout());
				
				createFileMenu(); 
				createEditMenu();
				
				JMenuBar menuBar = new JMenuBar();
				setJMenuBar(menuBar); 
				menuBar.setBackground(Color.white);
				menuBar.add(FileMenu); 
				menuBar.add(EditMenu);
				
				response = new JLabel("Welcome My Music Playlist Creator");
        		response.setSize(250, 250);
        		cPane.add(response);
        		
        		  
				
			}
	
						private void createFileMenu(){
							JMenuItem item; 
							FileMenu = new JMenu ("File"); 
							item = new JMenuItem("Register"); //Create Register User Button 
							item.addActionListener(this);
							FileMenu.add(item);
							
							item = new JMenuItem("Login");  
        					item.addActionListener( this );	//Create Login Button
        					FileMenu.add(item);
        					
        					item = new JMenuItem("Quit");  
        					item.addActionListener( this );	//This Button Quits The Program
        					FileMenu.add(item);

        					
						}
	
						
						private void createEditMenu(){ 
							JMenuItem item; 
							EditMenu = new JMenu ("Edit");
							
							item = new JMenuItem ("Create Playlist");
							item.addActionListener(this);	//Create Playlist Menu Button
        					EditMenu.add(item);
        					
        					item = new JMenuItem ("View Playlist");
							item.addActionListener(this);	//Show Playlist Menu Button 
        					EditMenu.add(item);
							
						}
	
						
} 
						public void actionPerformed(ActionEvent event) {
									String  menuName;
									menuName = event.getActionCommand();
			
									if (menuName.equals("Quit")) {
									    System.exit(0);
																 } 
			 
									if (menuName.equals("Login")){ 
			 	 setVisible(true);
			 }
			 
			 else {
			 	response.setText("Menu Item" + menuName + "is selected.");
			 }
			}
						
		