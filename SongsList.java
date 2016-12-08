
import java.util.*; 
import javax.swing.*; 

public class SongsList {
	
	private Random random = new Random();
	String Playlist, Message; 
	int Counter = 0;
	
	public void Songs()
	{ 
		ArrayList<String> Songs = new ArrayList<>();
		Songs.add("Robin Schulz & David Guetta - Shed A Light");
		Songs.add("Ten Ven - All This Time");
		Songs.add("The Aston Shuffle - Don't Let Go");
		Songs.add("Nightcrawlers - Push The Feeling On (Delta Jack 2016 Remix)");
		Songs.add("Major Lazer - Cold Water (feat. Justin Bieber & MØ)(Delta Jack Remix)");
		Songs.add("The Killers - Mr. Brightside (Two Friends Remix)");
		Songs.add("AYLA Ayla (Dj Taucher Mix)");
		Songs.add("KE - No Worries");
		Songs.add("TIEKS - SUNSHINE (FREEJAK RE-RUB)");
		Songs.add("offaiah - Trouble (eSQUIRE Remix)");
		Songs.add("Rihanna - Don't Stop The Music (SamRobs Remix)");
		Songs.add("Kideko & Après - Get The funk");
		Songs.add("Don Diablo - Cutting Shapes");
		Songs.add("Third Party - Everyday Of My Life");
		Songs.add("Disclosure - Omen (Claptone Remix)");
		Songs.add("Bruno Furlan & Dubdisko - Red Flag");
		Songs.add("Sammy Porter ft. Grace Fleary - True Colours (VIP Remix)");
		Songs.add("Clean Bandit ft Anne-Marie & Sean Paul - Rockabye (Jack Wins OFFICIAL Remix)");
		Songs.add("Art Deko & Chris Lorenzo - Together");
		Songs.add("That Noise - Surfdisco & NatNoiz");
		Songs.add("Skream - In For The Kill (Endor Remix)");
		Songs.add("ZAYN - SHE (LTGTR & Adam Barry Remix)");
		Songs.add("Martin Garrix - In the Name Of Love ft. Bebe Rexha (The Him Remix)");
		Songs.add("Sonny Bass & Chasner - Africa");
	
		
		while(Counter<=10)
		{ 
			int num = random.nextInt(Songs.size()); 
			
			 Playlist = "Song " + num + ": " + Songs.get(num);
			
			Counter++;
		}
		
			Message = "The Song I've Chosen For You Is " + Playlist;
			
			JOptionPane.showMessageDialog(null,Message); 
		
	}

}
