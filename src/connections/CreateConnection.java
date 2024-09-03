package connections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateConnection {
	
	//TODO; Page that lets you create
	public CreateConnection() { //Apologies in advance for the sheer amount of items and settings
		//Window settings
		JFrame win = new JFrame("Create Connection");
		win.setSize(450,500);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setLayout(null);
		
		//Name for connection
		JPanel namePanel = new JPanel();
		namePanel.setBounds(30,10,350,30);
		namePanel.setLayout(new FlowLayout());
		namePanel.add(new JLabel("Connection Name: "));
		JTextField name = new JTextField("", 15);
		namePanel.add(name);
		win.add(namePanel);
		
		//Name for group 1
		JPanel groupOneNamePanel = new JPanel();
		groupOneNamePanel.setBounds(15,50,400,30);
		groupOneNamePanel.setLayout(new FlowLayout());
		groupOneNamePanel.add(new JLabel("Group 1: "));
		JTextField groupOneName = new JTextField("", 20);
		groupOneNamePanel.add(groupOneName);
		win.add(groupOneNamePanel);
		
		//Items in group 1
		JPanel groupOneItemsPanel = new JPanel();
		groupOneItemsPanel.setBounds(30,80,375,30);
		groupOneItemsPanel.setLayout(new GridLayout(1,4));
		groupOneItemsPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JTextField g1i1 = new JTextField();
		JTextField g1i2 = new JTextField();
		JTextField g1i3 = new JTextField();
		JTextField g1i4 = new JTextField();
		groupOneItemsPanel.add(g1i1);
		groupOneItemsPanel.add(g1i2);
		groupOneItemsPanel.add(g1i3);
		groupOneItemsPanel.add(g1i4);
		win.add(groupOneItemsPanel);
		
		//Name for group 2
		JPanel groupTwoNamePanel = new JPanel();
		groupTwoNamePanel.setBounds(15,130,400,30);
		groupTwoNamePanel.setLayout(new FlowLayout());
		groupTwoNamePanel.add(new JLabel("Group 2: "));
		JTextField groupTwoName = new JTextField("", 20);
		groupTwoNamePanel.add(groupTwoName);
		win.add(groupTwoNamePanel);
		
		//Items in group 2
		JPanel groupTwoItemsPanel = new JPanel();
		groupTwoItemsPanel.setBounds(30,160,375,30);
		groupTwoItemsPanel.setLayout(new GridLayout(1,4));
		groupTwoItemsPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JTextField g2i1 = new JTextField();
		JTextField g2i2 = new JTextField();
		JTextField g2i3 = new JTextField();
		JTextField g2i4 = new JTextField();
		groupTwoItemsPanel.add(g2i1);
		groupTwoItemsPanel.add(g2i2);
		groupTwoItemsPanel.add(g2i3);
		groupTwoItemsPanel.add(g2i4);
		win.add(groupTwoItemsPanel);
		
		//Name for group 3
		JPanel groupThreeNamePanel = new JPanel();
		groupThreeNamePanel.setBounds(15,200,400,30);
		groupThreeNamePanel.setLayout(new FlowLayout());
		groupThreeNamePanel.add(new JLabel("Group 2: "));
		JTextField groupThreeName = new JTextField("", 20);
		groupThreeNamePanel.add(groupThreeName);
		win.add(groupThreeNamePanel);
		
		//Items in group 3
		JPanel groupThreeItemsPanel = new JPanel();
		groupThreeItemsPanel.setBounds(30,230,375,30);
		groupThreeItemsPanel.setLayout(new GridLayout(1,4));
		groupThreeItemsPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JTextField g3i1 = new JTextField();
		JTextField g3i2 = new JTextField();
		JTextField g3i3 = new JTextField();
		JTextField g3i4 = new JTextField();
		groupThreeItemsPanel.add(g3i1);
		groupThreeItemsPanel.add(g3i2);
		groupThreeItemsPanel.add(g3i3);
		groupThreeItemsPanel.add(g3i4);
		win.add(groupThreeItemsPanel);
		
		//Name for group 4
		JPanel groupFourNamePanel = new JPanel();
		groupFourNamePanel.setBounds(15,280,400,30);
		groupFourNamePanel.setLayout(new FlowLayout());
		groupFourNamePanel.add(new JLabel("Group 4: "));
		JTextField groupFourName = new JTextField("", 20);
		groupFourNamePanel.add(groupFourName);
		win.add(groupFourNamePanel);
		
		//Items in group 4
		JPanel groupFourItemsPanel = new JPanel();
		groupFourItemsPanel.setBounds(30,310,375,30);
		groupFourItemsPanel.setLayout(new GridLayout(1,4));
		groupFourItemsPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JTextField g4i1 = new JTextField();
		JTextField g4i2 = new JTextField();
		JTextField g4i3 = new JTextField();
		JTextField g4i4 = new JTextField();
		groupFourItemsPanel.add(g4i1);
		groupFourItemsPanel.add(g4i2);
		groupFourItemsPanel.add(g4i3);
		groupFourItemsPanel.add(g4i4);
		win.add(groupFourItemsPanel);
		
		//Panel with difficulty bar
		JPanel difficultyPanel = new JPanel();
		difficultyPanel.setBounds(30,350,375,30);
		difficultyPanel.setLayout(new FlowLayout());
		difficultyPanel.add(new JLabel("Difficulty: "));
		String[] difficultyOptions = { "Normal", "Hard Purple", "Hard Overall" };
		JComboBox<String> difficultySetting = new JComboBox<String>(difficultyOptions);
		difficultySetting.setEditable(false);
		difficultyPanel.add(difficultySetting);
		win.add(difficultyPanel);
		
		//Buttons ar the bottom
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30,390,375,60);
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JButton createButton = new JButton("Create");
		JButton createAndPlayButton = new JButton("Create and Play");
		JButton cancelButton = new JButton("Cancel");
		buttonPanel.add(createButton);
		buttonPanel.add(createAndPlayButton);
		buttonPanel.add(cancelButton);
		win.add(buttonPanel);
		
		ActionListener act = e -> {
			if(e.getSource() == createButton) {
				//Get items from connection groups
				String[][] modelGroups = {
						{ g1i1.getText(), g1i2.getText(), g1i3.getText(), g1i4.getText() },
						{ g2i1.getText(), g2i2.getText(), g2i3.getText(), g2i4.getText() },
						{ g3i1.getText(), g3i2.getText(), g3i3.getText(), g3i4.getText() },
						{ g4i1.getText(), g4i2.getText(), g4i3.getText(), g4i4.getText() }
				};
				
				//Get connection group names
				String[] modelGroupNames = { groupOneName.getText(), groupTwoName.getText(), groupThreeName.getText(), 
						groupFourName.getText() };
				
				//Make a new connection
				Connection createdConnection = new Connection(modelGroups, modelGroupNames, name.getText(), 
						difficultySetting.getSelectedIndex());
				
				//Export the connection, then notify and close
				createdConnection.export();
				new PopupWindow("Connection created! Check Desktop for file");
				win.dispose();
			}
			
			if(e.getSource() == createAndPlayButton) {
				
			}
			
			if(e.getSource() == cancelButton) {
				new PopupWindow("Connection Creation Canceled");
				win.dispose();
			}
		};
		
		createButton.addActionListener(act);
		createAndPlayButton.addActionListener(act);
		cancelButton.addActionListener(act);
		
		win.setVisible(true);
	}
}
