import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;


import javax.swing.*;


public class MusicCreatorMain extends MusicCreator{
	
	public static ArrayList<songData> SongList = new ArrayList<songData>();
	
	public void SongData() throws Exception //creates save UserMethod 
	{ 
		File songData = new File("songData.dat"); //Creates Userdata.dat file
		FileOutputStream fileOut = new FileOutputStream(songData); //File outputs to the file Userdata 
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); //Object outputs to the file output stream 
		
		objectOut.writeObject(SongList); //writes the object Userlist which is an Array 
		objectOut.close(); // closes the object
	}
	/*
	public void  SoundClipTest() {     /* music for eating a ball https://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html 
	
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
	} */
	
	public static void main (String[] args)
	{ 
		MusicCreator mainmenu = new MusicCreator();
		mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainmenu.setSize(300,300);
		mainmenu.setVisible(true);
		
	
	}
}
