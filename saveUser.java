import java.io.*;
/** 
 * 
 * @author Michael
 *
 */
public class saveUser implements Serializable {
	private String name,username,password,email;
/**  
 * 	
 * @param name This is the users name which is entered at the resgister screen it should include their first and last name  
 * @param username This is the users username which is entered at the register screen
 * @param password This is the users password which is entered in at the register screen 
 * @param email This is the users email , it must contain 1 @ sign. 
 */
	public saveUser(String name , String username , String password , String email)

	{ 
/**
 *  Here I state that the String variables are equals to the parameters of my saveUser method.
 */
		
		this.name = name; 
		this.username = username; 
		this.password = password; 
		this.email = email; 
	}
	
/**
 * Gets the Name of the user
 * @return this users name
 */
		public String getName()
		{ 
			return name; 
		}
/**
 * Gets the Username entered by the user		
 * @return the username entered
 */
		public String getUsername()
		{ 
			return username; 
		}
/** 
 * Gets the password entered by the user 		
 * @return the password entered
 */
		public String getPassword()
		{ 
			return password; 
		}
/** 
 * Get the email entered by the user 	
 * @return the email entered
 */
		public String getEmail()
		{ 
			return email;
		}
}
