package connections;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.datatransfer.*;
import java.util.*;
import javax.swing.*;

public class ResultsPage {
	
	Color[] displayColors;
	
	public ResultsPage(ArrayList<String> guesses, String name, int difficulty) {
		//Set colors
		if (difficulty == 2) {
			Color[] bruh = { new Color(164,195,92), new Color(181,196,238), new Color(180,129,197), new Color(195,91,93) };
			this.displayColors = bruh;
		}
		else if (difficulty == 1) {
			Color[] bruh = { new Color(243,223,113), new Color(164,195,92), new Color(181,196,238), new Color(195,91,93) };
			this.displayColors = bruh;
		}
		else {
			Color[] bruh = { new Color(243,223,113), new Color(164,195,92), new Color(181,196,238), new Color(180,129,197) };
			this.displayColors = bruh;
		}
		
		JFrame win = new JFrame("Your results");
		win.setSize(300,400);
		win.setLocationRelativeTo(null);
		win.setLayout(null);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel guess1 = new JPanel();
		guess1.setBounds(15,10,260,30);
		guess1.setLayout(null);
		JPanel g1i1 = new JPanel();
		g1i1.setBounds(0,0,60,30);
		g1i1.setBackground(displayColors[(int)(guesses.get(0).charAt(0) - '1')]);
		guess1.add(g1i1);
		JPanel g1i2 = new JPanel();
		g1i2.setBounds(62,0,60,30);
		g1i2.setBackground(displayColors[(int)(guesses.get(0).charAt(1) - '1')]);
		guess1.add(g1i2);
		JPanel g1i3 = new JPanel();
		g1i3.setBounds(124,0,60,30);
		g1i3.setBackground(displayColors[(int)(guesses.get(0).charAt(2) - '1')]);
		guess1.add(g1i3);
		JPanel g1i4 = new JPanel();
		g1i4.setBounds(186,0,60,30);
		g1i4.setBackground(displayColors[(int)(guesses.get(0).charAt(3) - '1')]);
		guess1.add(g1i4);
		win.add(guess1);
		
		JPanel guess2 = new JPanel();
		guess2.setBounds(15,50,260,30);
		guess2.setLayout(null);
		JPanel g2i1 = new JPanel();
		g2i1.setBounds(0,0,60,30);
		g2i1.setBackground(displayColors[(int)(guesses.get(1).charAt(0) - '1')]);
		guess2.add(g2i1);
		JPanel g2i2 = new JPanel();
		g2i2.setBounds(62,0,60,30);
		g2i2.setBackground(displayColors[(int)(guesses.get(1).charAt(1) - '1')]);
		guess2.add(g2i2);
		JPanel g2i3 = new JPanel();
		g2i3.setBounds(124,0,60,30);
		g2i3.setBackground(displayColors[(int)(guesses.get(1).charAt(2) - '1')]);
		guess2.add(g2i3);
		JPanel g2i4 = new JPanel();
		g2i4.setBounds(186,0,60,30);
		g2i4.setBackground(displayColors[(int)(guesses.get(1).charAt(3) - '1')]);
		guess2.add(g2i4);
		win.add(guess2);
		
		JPanel guess3 = new JPanel();
		guess3.setBounds(15,90,260,30);
		guess3.setLayout(null);
		JPanel g3i1 = new JPanel();
		g3i1.setBounds(0,0,60,30);
		g3i1.setBackground(displayColors[(int)(guesses.get(2).charAt(0) - '1')]);
		guess3.add(g3i1);
		JPanel g3i2 = new JPanel();
		g3i2.setBounds(62,0,60,30);
		g3i2.setBackground(displayColors[(int)(guesses.get(2).charAt(1) - '1')]);
		guess3.add(g3i2);
		JPanel g3i3 = new JPanel();
		g3i3.setBounds(124,0,60,30);
		g3i3.setBackground(displayColors[(int)(guesses.get(2).charAt(2) - '1')]);
		guess3.add(g3i3);
		JPanel g3i4 = new JPanel();
		g3i4.setBounds(186,0,60,30);
		g3i4.setBackground(displayColors[(int)(guesses.get(2).charAt(3) - '1')]);
		guess3.add(g3i4);
		win.add(guess3);
		
		JPanel guess4 = new JPanel();
		guess4.setBounds(15,130,260,30);
		guess4.setLayout(null);
		JPanel g4i1 = new JPanel();
		g4i1.setBounds(0,0,60,30);
		g4i1.setBackground(displayColors[(int)(guesses.get(3).charAt(0) - '1')]);
		guess4.add(g4i1);
		JPanel g4i2 = new JPanel();
		g4i2.setBounds(62,0,60,30);
		g4i2.setBackground(displayColors[(int)(guesses.get(3).charAt(1) - '1')]);
		guess4.add(g4i2);
		JPanel g4i3 = new JPanel();
		g4i3.setBounds(124,0,60,30);
		g4i3.setBackground(displayColors[(int)(guesses.get(3).charAt(2) - '1')]);
		guess4.add(g4i3);
		JPanel g4i4 = new JPanel();
		g4i4.setBounds(186,0,60,30);
		g4i4.setBackground(displayColors[(int)(guesses.get(3).charAt(3) - '1')]);
		guess4.add(g4i4);
		win.add(guess4);
		
		if (guesses.size() >= 5) {
			JPanel guess5 = new JPanel();
			guess5.setBounds(15,170,260,30);
			guess5.setLayout(null);
			JPanel g5i1 = new JPanel();
			g5i1.setBounds(0,0,60,30);
			g5i1.setBackground(displayColors[(int)(guesses.get(4).charAt(0) - '1')]);
			guess5.add(g5i1);
			JPanel g5i2 = new JPanel();
			g5i2.setBounds(62,0,60,30);
			g5i2.setBackground(displayColors[(int)(guesses.get(4).charAt(1) - '1')]);
			guess5.add(g5i2);
			JPanel g5i3 = new JPanel();
			g5i3.setBounds(124,0,60,30);
			g5i3.setBackground(displayColors[(int)(guesses.get(4).charAt(2) - '1')]);
			guess5.add(g5i3);
			JPanel g5i4 = new JPanel();
			g5i4.setBounds(186,0,60,30);
			g5i4.setBackground(displayColors[(int)(guesses.get(4).charAt(2) - '1')]);
			guess5.add(g5i4);
			win.add(guess5);
		}
		
		if (guesses.size() >= 6) {
			JPanel guess6 = new JPanel();
			guess6.setBounds(15,210,260,30);
			guess6.setLayout(null);
			JPanel g6i1 = new JPanel();
			g6i1.setBounds(0,0,60,30);
			g6i1.setBackground(displayColors[(int)(guesses.get(5).charAt(0) - '1')]);
			guess6.add(g6i1);
			JPanel g6i2 = new JPanel();
			g6i2.setBounds(62,0,60,30);
			g6i2.setBackground(displayColors[(int)(guesses.get(5).charAt(1) - '1')]);
			guess6.add(g6i2);
			JPanel g6i3 = new JPanel();
			g6i3.setBounds(124,0,60,30);
			g6i3.setBackground(displayColors[(int)(guesses.get(5).charAt(2) - '1')]);
			guess6.add(g6i3);
			JPanel g6i4 = new JPanel();
			g6i4.setBounds(186,0,60,30);
			g6i4.setBackground(displayColors[(int)(guesses.get(5).charAt(3) - '1')]);
			guess6.add(g6i4);
			win.add(guess6);
		}
		
		if (guesses.size() >= 7) {
			JPanel guess7 = new JPanel();
			guess7.setBounds(15,250,260,30);
			guess7.setLayout(null);
			JPanel g7i1 = new JPanel();
			g7i1.setBounds(0,0,60,30);
			g7i1.setBackground(displayColors[(int)(guesses.get(6).charAt(0) - '1')]);
			guess7.add(g7i1);
			JPanel g7i2 = new JPanel();
			g7i2.setBounds(62,0,60,30);
			g7i2.setBackground(displayColors[(int)(guesses.get(6).charAt(1) - '1')]);
			guess7.add(g7i2);
			JPanel g7i3 = new JPanel();
			g7i3.setBounds(124,0,60,30);
			g7i3.setBackground(displayColors[(int)(guesses.get(6).charAt(2) - '1')]);
			guess7.add(g7i3);
			JPanel g7i4 = new JPanel();
			g7i4.setBounds(186,0,60,30);
			g7i4.setBackground(displayColors[(int)(guesses.get(6).charAt(3) - '1')]);
			guess7.add(g7i4);
			win.add(guess7);
		}
		
		JPanel buttons = new JPanel();
		buttons.setBounds(25,290,230,30);
		buttons.setLayout(new GridLayout(1,3));
		buttons.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		JButton copyButton = new JButton("Copy");
		JButton closeButton = new JButton("Close");
		buttons.add(copyButton);
		buttons.add(new JLabel(""));
		buttons.add(closeButton);
		win.add(buttons);
		
		ActionListener act = e -> {
			if (e.getSource() == closeButton) win.dispose(); //close the screen
			if (e.getSource() == copyButton) {//Copy the results to the clipboard
				StringBuffer copyBuffer = new StringBuffer();
				copyBuffer.append("I finished " + name + "!");
				
				//go thru each
				for (int i = 0; i < guesses.size(); i++) {
					//New line for each
					copyBuffer.append("\n");
					String guessString = guesses.get(i);
					//go thru each thing
					for (int j = 0; j < guessString.length(); j++) {
						int index = (int)(guessString.charAt(j)-'1');
						//copy each emoji to the buffer
						copyBuffer.append(getEmojiString(displayColors[index]));
					}
				}
				
				//Select text and put it in clipboard
				StringSelection select = new StringSelection(copyBuffer.toString());
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(select, null);
				
				//Popup to notify!
				new PopupWindow("Copied results.");
			}
		};
		
		//add listener to buttons
		copyButton.addActionListener(act);
		closeButton.addActionListener(act);
		
		win.setVisible(true);
	}
	
	String getEmojiString(Color color) {
		if (color.getBlue() == 113) return ":yellow_square:";
		if (color.getBlue() == 92) return ":green_square:";
		if (color.getBlue() == 238) return ":blue_square:";
		if (color.getBlue() == 197) return ":purple_square:";
		return ":red_square:";
	}
}
