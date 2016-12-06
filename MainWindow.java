import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame
{
	JLabel  Info; 
	JButton createPlaylist;
	public MainWindow()
	{ 
		super("Welcome to Playlist Creator"); 
		setLayout(new FlowLayout()); 
		setSize(800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		Info = new JLabel ("Click the button below to create a playlist");
		add(Info); 
		
		createPlaylist = new JButton ("Create Playlist"); 
		add(createPlaylist); 
	}
}
