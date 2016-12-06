import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class MainWindow extends JFrame
{
	JLabel  Info; 
	JButton createPlaylist;
	
	public void  SoundClipTest() {     /* music for eating a ball https://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html */

		try {
			// Open an audio input stream.
			URL url = this.getClass().getClassLoader().getResource("cello.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
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
		
		createplaylisthandler gettingobjectsound = new createplaylisthandler(); 
		createPlaylist.addActionListener(gettingobjectsound);
	}
		
	private class createplaylisthandler implements ActionListener
	{ 
		public void actionPerformed(ActionEvent registerEvent)
		{ 
			
			SoundClipTest(); 
				
		}
	}
		
}
