import java.io.Serializable;
import java.util.*;
import java.io.*;


public class songData implements Serializable {
	
	private Random songpicker = new Random();
	private String songschosen; 
	private int counter; 
	
		public void createSongList() throws FileNotFoundException
		{ 
			Scanner songs = new Scanner(new File("songs.txt"));
		
			ArrayList<String> songList = new ArrayList<String>();
		
		
			for(counter=0;counter<10;counter++)
				{ 
		 
					songs.hasNextLine(); 
		 	
					songList.add(songs.nextLine());
	 
					System.out.println(songList); 
				} 
	 
					songs.close(); 
		} 
 } 