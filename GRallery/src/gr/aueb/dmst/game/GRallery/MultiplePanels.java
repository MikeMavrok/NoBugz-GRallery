import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class MultiplePanels implements ActionListener{
	
	JFrame frame = new JFrame("GRallery");
	JButton[][] b = new JButton[10][4];
	JButton NextQuestion = new JButton("Next Question");
	String CorrectAnswers [] = new String[10];
	String[][] answers = new String[10][4];
	String[] questions = new String[10];
	ImageIcon [] images = new ImageIcon[10];

	
	public void ConstructImages() {
		images[0] = new ImageIcon(getClass().getResource("/faros.jpg"));
		images[1] = new ImageIcon(getClass().getResource("/delfoi.jpg"));
		images[2] = new ImageIcon(getClass().getResource("/oreli.jpg"));
	}
	
	public void ConstructAnswers() {
		for(int i = 0; i<questions.length ; i++) {
			answers[i][0] = "answer1";
			answers[i][1] = "answer2";
			answers[i][2] = "answer3";
			answers[i][3] = "answer4";
		}
	}
	
	public void ConstructQuestions() {
		//pws tha emfanizetai oli i erwtisi xwris scroll
		questions[0] = "Ο «Φάρος» εικάζεται πως αποτελεί μία απεικόνιση ενός πραγματικού φάρου σε κάποιο κυκλαδίτικο\n νησί με σκοπό σε συνδυασμό με άλλα έργα να αναδειχθεί το ελληνικό καλοκαίρι.Σε ποιον γνωστό\n Έλληνα ζωγράφο με καταγωγή από την Τήνο ανήκει ο συγκεκριμένος πίνακας;";
		questions[1] = "poia texniki xrisimopoiei? \n ";
		questions[2] = "poia periodo filotexnithike?";
	}
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
	}

	
	MultiplePanels(){
		
		ConstructQuestions();
    	ConstructImages();
    	ConstructAnswers();
    	CorrectAnswers();
    	
    	JPanel panel1 = new JPanel();
    	JPanel panel2 = new JPanel();
    	JPanel panel3 = new JPanel();
    	
		NextQuestion.setEnabled(false);
		
		Random rand = new Random();
    	int question_number = rand.nextInt(3);
    	
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);
		
		JLabel imageLabel = new JLabel(images[question_number]);
		panel1.add(imageLabel);

		JLabel questionLabel = new JLabel(); 
		//allagi se JTextArea giati etsi vgainei olo se mia grammi
		//JTextArea questionLabel = new JTextArea();
		questionLabel.setSize(200, 200);
		questionLabel.setFont(new Font(null,Font.LAYOUT_RIGHT_TO_LEFT,25));
		//questionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		//questionLabel.setHorizontalTextPosition(JLabel.CENTER);
		questionLabel.setText(questions[question_number]);
		panel3.add(questionLabel,BorderLayout.BEFORE_FIRST_LINE);
		
		JLabel messageLabel = new JLabel();
    	messageLabel.setSize(100, 100);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		messageLabel.setHorizontalTextPosition(JLabel.CENTER);
		messageLabel.setVerticalTextPosition(JLabel.CENTER);
		panel3.add(messageLabel,BorderLayout.AFTER_LINE_ENDS);
		
		b[question_number][0] = new JButton(answers[question_number][0]);
		b[question_number][0].setBounds(10,40,160,40);
		b[question_number][1] = new JButton(answers[question_number][1]);
		b[question_number][1].setBounds(10,40,160,40);
		b[question_number][2] = new JButton(answers[question_number][2]);
		b[question_number][2].setBounds(10,40,160,40);
		b[question_number][3] = new JButton(answers[question_number][3]);
		b[question_number][3].setBounds(10,40,160,40);
		
		for(int answer_number=0; answer_number<4; answer_number++) {
			
			b[question_number][answer_number].setFocusable(false);
			panel2.add(b[question_number][answer_number]); 
			
			b[question_number][answer_number].setSize(new Dimension(500, 50));
			b[question_number][answer_number].setLocation(100,100);
			b[question_number][answer_number].setFont(new Font(null,Font.ITALIC,22));
			b[question_number][answer_number].setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	
			b[question_number][answer_number].addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	                if(e.getSource() == b[question_number][0] ) {
	                	//den mporei o xristis na allaksei tin apantisi tou kai monadiki tou epilogi na proxwrisei se epomeni erwtisi
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if((b[question_number][0].getText()) == CorrectAnswers[question_number]) {
	                		//an apantisei swsta to koumpi pou patise ginetai prasino kai emfanizetai minuma CORRECT
	                		messageLabel.setForeground(Color.green);
							messageLabel.setText("CORRECT");
							b[question_number][0].setBackground(Color.GREEN);
	                	}else {
	                		//an apantisei lathos to koumpi pou patise ginetai kokkino kai emfanizetai minuma WRONG
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][0].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][1] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][1].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][1].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][1].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][2] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][2].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][2].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][2].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][3] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][3].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][3].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][3].setBackground(Color.RED);
	                	}
	                }
	        	}
	        	});
			}
			//pws na mpei terma deksia katw
			NextQuestion.setBounds(0,500,100,100);
			NextQuestion.setBackground(Color.BLACK);//diaforetiko to koumpi NextQuestion gia na ksexwrizei apo auta twn apantisewn
			NextQuestion.setForeground(Color.WHITE);
			NextQuestion.setFont(new Font(null,Font.ROMAN_BASELINE,12));
			panel2.add(NextQuestion, BorderLayout.SOUTH);

			NextQuestion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==NextQuestion) {
						//an o xristis epileksei NextQuestion kleinei auto to parathuro
						frame.dispose();
						MultiplePanels m =new MultiplePanels();
					}
				}
			});

			frame.add(panel1,BorderLayout.BEFORE_FIRST_LINE);
			frame.add(panel2,BorderLayout.PAGE_END);
			frame.add(panel3,BorderLayout.CENTER);
			frame.setSize(1200,1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}



