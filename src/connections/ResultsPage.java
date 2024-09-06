package connections;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ResultsPage {
	
	Color[] displayColors;
	
	public ResultsPage(ArrayList<String> guesses, int difficulty) {
		//Set colors
		if (difficulty == 2) {
			Color[] bruh = { new Color(164,195,92), new Color(181,196,238), new Color(180,129,197), new Color(195,91,93) };
			this.displayColors = bruh;
		}
		if (difficulty == 1) {
			Color[] bruh = { new Color(243,223,113), new Color(164,195,92), new Color(181,196,238), new Color(195,91,93) };
			this.displayColors = bruh;
		}
		else {
			Color[] bruh = { new Color(243,223,113), new Color(164,195,92), new Color(181,196,238), new Color(180,129,197) };
			this.displayColors = bruh;
		}
		
		JFrame win = new JFrame("Your reslts");
		win.setSize(300,400);
		win.setLocationRelativeTo(null);
	}
}
