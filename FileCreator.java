import java.io.*; 
import java.lang.*; 
import java.util.*;
import javax.swing.JOptionPane; 

public class FileCreator{

private String forename , surname , username , password , email;


	private Formatter a; 
	
		public void openFile() 
		{ 
			try { 
					a = new Formatter("UsersInfo.txt");
				} 
				
			catch(Exception e)
			{ 
				JOptionPane.showMessageDialog(null,"Error Wrtiting File","Error",JOptionPane.WARNING_MESSAGE);
			}
		
		}
		
		public void addRecords()
			{ 
				a.format(forename,surname,username,password,email); 
			}

		public void closeFile()
			{ 
				a.close();
			}
	
}
