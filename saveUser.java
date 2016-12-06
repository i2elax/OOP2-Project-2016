import java.io.*;

public class saveUser implements Serializable {
	private String name,username,password,email;
	
	public saveUser(String name , String username , String password , String email)
	{ 
		this.name = name; 
		this.username = username; 
		this.password = password; 
		this.email = email; 
	}
		public String getName()
		{ 
			return name; 
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
