import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewWindow implements ActionListener{
	//create a window
	JFrame frame = new JFrame();
	
	//Label-message to the user
	JLabel label1 = new JLabel();
	
	
	JLabel lquestion = new JLabel();
	JLabel labelc = new JLabel("CORRECT");
	JLabel labelw = new JLabel("WRONG");
	
	
	
	JButton buttonchoises []= new JButton [4];
	
	String[] choises = new String[4];

	Room1 room1 = new Room1();
	
	//the number of the random question
	int q = (int) (Math.random()*14 );
	
	public NewWindow () {
		
		frame.setVisible(true);
		
		//create the ingredients for the label1
		label1.setText("Mina, you are in the first room");
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setForeground(new Color(255,255,255));
		label1.setBounds(50, 50, 600, 300);
		label1.setFont(new Font(null,Font.PLAIN,30));
		label1.setVisible(true);
		
		
		
		//display the question in a label
		lquestion.setText(room1.getQuestions1(q));
		lquestion.setVerticalTextPosition(JLabel.CENTER);
		lquestion.setForeground(new Color(255,255,255));
		lquestion.setBounds(50, 50, 600, 300);
		lquestion.setFont(new Font(null,Font.PLAIN,24));
		lquestion.setVisible(true);
		
		
		//display the choices in buttons
		choises=room1.getAnswers1(q);
		buttonchoises[0] = new JButton(choises[0]);
		buttonchoises[1] = new JButton(choises[1]);
		buttonchoises[2] = new JButton(choises[2]);
		buttonchoises[3] = new JButton(choises[3]);
		
		
		buttonchoises[0].setBounds(200,100,100,50);
		buttonchoises[0].setFocusable(false);
		
		buttonchoises[1].setBounds(300,100,100,50);
		buttonchoises[1].setFocusable(false);
		
		buttonchoises[2].setBounds(400,100,100,50);
		buttonchoises[2].setFocusable(false);
		
		buttonchoises[3].setBounds(500,100,100,50);
		buttonchoises[3].setFocusable(false);
		
		
		buttonchoises[0].addActionListener(this); 
		buttonchoises[1].addActionListener(this); 
		buttonchoises[2].addActionListener(this); 
		buttonchoises[3].addActionListener(this); 
	        	
		
		frame.add(label1); //add the label in the window
		
		frame.add(lquestion);
		
		//add the buttons in the window
		frame.add(buttonchoises[0]);
		frame.add(buttonchoises[1]);
		frame.add(buttonchoises[2]);
		frame.add(buttonchoises[3]);
		
				
		
		//create the ingredients for the frame
		frame.setTitle("ROOM 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLayout(null);
		
		//display an icon in the top of the window...not yet
		ImageIcon image1 = new ImageIcon("Screenshot (282).png");
		frame.setIconImage(image1.getImage());
		frame.getContentPane().setBackground(new Color(50,95,200));
		
		
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		//if we click the button
		if(e.getSource()==	buttonchoises[0] ) {
		//AND if this button is the right answer then Correct
			if(room1.getRightAnswer(q)==1) {
				labelc.setVisible(true);
				
			}else { //else Wrong
				labelw.setVisible(false);
			}
		}
		
		
		if(e.getSource()==	buttonchoises[1] ) {
			
			if(room1.getRightAnswer(q)==2) {
				labelc.setVisible(true);
			}else {
				labelw.setVisible(true);
			}
		}
		
		
		if(e.getSource()==	buttonchoises[2] ) {
			
			if(room1.getRightAnswer(q)==3) {
				labelc.setVisible(true);
			}else {
				labelw.setVisible(true);
			}
		}
		
		
		if(e.getSource()==	buttonchoises[3] ) {
			
			if(room1.getRightAnswer(q)==4) {
				labelc.setVisible(true);
			}else {
				labelw.setVisible(true);
			}
		}
			
	}

	
	
}
