import javax.swing.*;

class MusicCreatorMain 
{
	public static void main (String[] args)
	{ 
		MusicCreator mainwindow = new MusicCreator();
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setSize(300,300);
		mainwindow.setVisible(true);
	}
}
