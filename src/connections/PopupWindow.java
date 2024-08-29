package connections;

import java.awt.GridLayout;
import javax.swing.*;

public class PopupWindow {
	public PopupWindow(String message) {
		JFrame window = new JFrame("RichPopup");
		window.setSize(300,150);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setLayout(null);
		
		//panel with message
		JPanel msg = new JPanel();
		msg.setBounds(10,10,250,50);
		JTextField viewMsg = new JTextField(message);
		viewMsg.setEditable(false);
		viewMsg.setSize(250,50);
		msg.add(viewMsg);
		window.add(msg);
		
		//panel for closing button
		JPanel button = new JPanel();
		button.setBounds(100,70,100,20);
		button.setLayout(new GridLayout(1,1));
		JButton ok = new JButton("OK");
		ok.addActionListener(e -> {
			window.dispose();
		});
		button.add(ok);
		window.add(button);
		
		window.setVisible(true);
	}
}
