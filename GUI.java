import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
	JButton button1;
	int buttoncount=0; 

  public static void main(String [] args)
  	{
    	GUI jFrame = new GUI();
    	jFrame.setVisible(true);  
    }
    
   public GUI()
   	{ 
   	setTitle ("Song's"); 
   	setSize(1000,1000);
   	setDefaultCloseOperation(EXIT_ON_CLOSE);
   	
   	Container contentPane = getContentPane();
   	contentPane.setBackground(Color.white); 
   	contentPane.setLayout(new FlowLayout());
   		
   	button1 = new JButton(new Integer(0) .toString());
   	button1.addActionListener(this);
   	contentPane.add(button1);
   } 
   
   public void actionPerformed (ActionEvent event){ 
   	buttoncount++; 
   	button1.setText(buttoncount+"");
   }	
   	
   	}