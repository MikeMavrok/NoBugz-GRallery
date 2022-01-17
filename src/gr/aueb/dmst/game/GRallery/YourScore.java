package gr.aueb.dmst.game.GRallery;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class YourScore  implements ActionListener{

	JFrame frame = new JFrame("Final Score");
	JButton closeButton = new JButton("Τέλος");
	
	YourScore(int score, String highscore){
		
		final JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea(10, 65);
		textArea.setEditable(false);
		textArea.setSize(200,200);
		textArea.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,20));
		textArea.setText("Η Τελική Βαθμολογία σου είναι: " + score );
		
		panel.add(textArea,BorderLayout.BEFORE_FIRST_LINE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
	    textArea.setEditable(false);
	    panel.add(textArea);
	    
	    frame.add(panel);
	    frame.pack();
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1100,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	
		closeButton.setBounds(475,290,100,50);
		closeButton.setFocusable(false);
		closeButton.addActionListener(this);
		
		frame.add(closeButton);
		
	 }
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
				if(e.getSource() == closeButton) {
					frame.dispose();
				}
		}
		
}
			
	
		
		


