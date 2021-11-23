package gr.aueb.dmst.game.GRallery;
import java.util.HashMap; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage  implements ActionListener{
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JTextField userNameField = new JTextField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userNameLabel = new JLabel("userName:");
	JLabel messageLabel = new JLabel();
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;	
		
		userIDLabel.setBounds(50,100,75,25);
		userNameLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userNameField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userNameLabel);
		frame.add(messageLabel);
		frame.add(userIDField);		
		frame.add(userNameField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton) {
			userIDField.setText("");
			userNameField.setText("");
		}
		
		if (e.getSource() == loginButton){
			String userID = userIDField.getText();
			String userName = userNameField.getText();
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(userName)){
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					WelcomePage welcomePage = new WelcomePage(userName);
				} else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong userName");
				}
				
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Wrong userID");	
			}
		}
	}
}