import java.io.Serializable;

public class songData implements Serializable {
	private String Songname,username,password,email;
	
	public songData(String Songname)
	{ 
		this.Songname = Songname; 
		 
	}
		public String getName()
		{ 
			return Songname; 
		}
		
		public String getUsername()
		{ 
			return username; 
		}
		
		public String getPassword()
		{ 
			return password; 
		}
		
		public String getEmail()
		{ 
			return email;
		}
}