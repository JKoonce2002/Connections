package connections;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;

public class StartPage {
	public StartPage() {
		JFrame window = new JFrame("Connections");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,350);
		window.setLocationRelativeTo(null);
		window.setLayout(null);
		
		JPanel instructionPanel = new JPanel();
		instructionPanel.setBounds(25,5,350,200);
		instructionPanel.setLayout(new GridLayout(1,1));
		JLabel instructions = new JLabel("<html><div style='text-align: center'>"
				+ "Create four sets of four Connections between the following words based on english, general knowledge, and the lore of Web multiverse. <br>---<br>"
				+ "Difficulty colors proceed as usual (yellow, green, blue, purple), but exceptionally challenging categories that require out of the box thinking"
				+ "or hidden Web lore may be marked with red squares instead of purple.</div></html>");
		instructionPanel.add(instructions);
		window.add(instructionPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(70,220,250,30);
		buttonPanel.setLayout(new GridLayout(1,3));
		JButton playButton = new JButton("Play");
		buttonPanel.add(playButton);
		buttonPanel.add(new JLabel(""));
		JButton createButton = new JButton("Create");
		buttonPanel.add(createButton);
		window.add(buttonPanel);
		
		//ActionListener for button functionality
		ActionListener act = e -> {
			if (e.getSource() == playButton) {
				//Open file chooser dialogue box to choose connection
				JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView());
				int opt = chooser.showOpenDialog(null);
				
				if (opt == JFileChooser.APPROVE_OPTION) { //if a file was chosen
					//make sure it's a connection file (.cxn)
					String path = chooser.getSelectedFile().getAbsolutePath();
					if(path.substring(path.lastIndexOf('.')+1).equals("cxn")) new PlayConnection(path);
					else new PopupWindow("Invalid File Chosen");
					
				} else new PopupWindow("No Connection Chosen");
			}
			if (e.getSource() == createButton) { //Go to page to create connection
				new CreateConnection();
			}
		};
		
		//Add ActionListener to buttons
		playButton.addActionListener(act);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new StartPage();
	}
}